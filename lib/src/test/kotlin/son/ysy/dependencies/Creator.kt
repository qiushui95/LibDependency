package son.ysy.dependencies

import com.squareup.kotlinpoet.*
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.reflect.KClass

class Creator {

    private val currentDir by lazy {
        File("").absoluteFile
    }

    private val parentDir by lazy {
        currentDir.parentFile
    }

    private val buildSrcDir by lazy {
        File(parentDir, "buildSrc")
    }

    private val testDir by lazy {
        File(
            currentDir,
            "src/test/kotlin/${LibConstants.PACKAGE_NAME.replace(".", "/")}"
        )
    }

    @Test
    fun testCreateAll() {
        createKt()

        createMd()

        createGradle()
    }

    @Test
    fun createKt() {

        val codeList = listOf(
            createLibPluginIdBaseClass(),
            createDependenciesCode(),
            createLibPluginIdCode(),
            createDependencyMethodCode(),
        )

        listOf(currentDir, buildSrcDir)
            .asSequence()
            .map { File(it, "src/main/kotlin/son/ysy/dependencies") }
            .onEach { it.mkdirs() }
            .flatMap { dir ->
                codeList.map {
                    File(dir, "${it.first}.kt") to it.second
                }
            }
            .onEach { it.first.delete() }
            .onEach { it.first.createNewFile() }
            .forEach {
                it.first.writeText(it.second)
            }

        val pluginGradleCode = createPluginGradleCode()

        File(buildSrcDir, "plugins.gradle.kts")
            .apply {
                createNewFile()
                writeText(pluginGradleCode)
            }
    }

    private fun createDependencyMethodCode(): Pair<String, String> {
        val srcFile = File(testDir, "${LibConstants.CLASS_NAME_DEPENDENCIES_METHOD}.kt")

        return LibConstants.CLASS_NAME_DEPENDENCIES_METHOD to srcFile.readText()
    }

    private fun createLibPluginIdBaseClass(): Pair<String, String> {
        val srcFile = File(testDir, "${LibConstants.CLASS_NAME_PLUGIN_ID}.kt")

        return LibConstants.CLASS_NAME_PLUGIN_ID to srcFile.readText()
    }

    private fun createLibPluginIdCode(): Pair<String, String> {
        val classBuilder = TypeSpec.classBuilder(
            ClassName(LibConstants.PACKAGE_NAME, LibConstants.CLASS_NAME_PLUGINS)
        ).addAnnotation(
            AnnotationSpec.builder(Suppress::class)
                .addMember(
                    "%S,%S,%S",
                    "MemberVisibilityCanBePrivate",
                    "unused",
                    "RedundantVisibilityModifier"
                ).build()
        ).addModifiers(KModifier.SEALED)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(LibConstants.KEY_GROUP, String::class)
                    .addParameter(LibConstants.KEY_NAME, String::class)
                    .addParameter(LibConstants.KEY_VERSION, String::class)
                    .build(),
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_GROUP, String::class)
                    .initializer(LibConstants.KEY_GROUP)
                    .build()
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_NAME, String::class)
                    .initializer(LibConstants.KEY_NAME)
                    .build()
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_VERSION, String::class)
                    .initializer(LibConstants.KEY_VERSION)
                    .build()
            )

        PluginConfig::class.sealedSubclasses
            .mapNotNull { it.objectInstance }
            .map { config ->
                val pluginBuilder = TypeSpec.objectBuilder(config.javaClass.simpleName)
                    .superclass(ClassName("", LibConstants.CLASS_NAME_PLUGINS))
                    .addSuperclassConstructorParameter("%S", config.group)
                    .addSuperclassConstructorParameter("%S", config.name)
                    .addSuperclassConstructorParameter("%S", config.version)

                config::class
                    .nestedClasses
                    .mapNotNull { it.objectInstance }
                    .filterIsInstance<LibPluginId>()
                    .map { pluginId ->
                        TypeSpec.objectBuilder(pluginId.javaClass.simpleName)
                            .superclass(
                                ClassName(
                                    LibConstants.PACKAGE_NAME,
                                    LibConstants.CLASS_NAME_PLUGIN_ID
                                )
                            )
                            .addSuperclassConstructorParameter("%S", pluginId.id)
                            .run {
                                if (pluginId.version != null) {
                                    addSuperclassConstructorParameter("%S", pluginId.version)
                                } else {
                                    this
                                }
                            }
                            .build()
                    }.forEach(pluginBuilder::addType)

                pluginBuilder.build()
            }.forEach(classBuilder::addType)

        val sb = StringBuilder()

        FileSpec.builder(LibConstants.PACKAGE_NAME, LibConstants.CLASS_NAME_PLUGINS)
            .addType(classBuilder.build())
            .build()
            .writeTo(sb)

        return LibConstants.CLASS_NAME_PLUGINS to sb.toString().replace("public ", "")
    }

    private fun createDependenciesCode(): Pair<String, String> {
        val libDependenciesBuilder = TypeSpec.classBuilder(
            ClassName(LibConstants.PACKAGE_NAME, LibConstants.CLASS_NAME_DEPENDENCIES_OUTER)
        ).addAnnotation(
            AnnotationSpec.builder(Suppress::class)
                .addMember(
                    "%S,%S,%S",
                    "MemberVisibilityCanBePrivate",
                    "unused",
                    "RedundantVisibilityModifier"
                ).build()
        ).addModifiers(KModifier.SEALED)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(LibConstants.KEY_GROUP, String::class)
                    .addParameter(LibConstants.KEY_NAME, String::class)
                    .addParameter(LibConstants.KEY_VERSION, String::class)
                    .addParameter(LibConstants.KEY_DEPENDENCY_METHOD, DependencyMethod::class)
                    .build(),
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_GROUP, String::class)
                    .initializer(LibConstants.KEY_GROUP)
                    .build()
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_NAME, String::class)
                    .initializer(LibConstants.KEY_NAME)
                    .build()
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_VERSION, String::class)
                    .initializer(LibConstants.KEY_VERSION)
                    .build()
            ).addProperty(
                PropertySpec.builder(LibConstants.KEY_DEPENDENCY_METHOD, DependencyMethod::class)
                    .initializer(LibConstants.KEY_DEPENDENCY_METHOD)
                    .build()
            )

        libDependenciesBuilder.addType(buildSingleTypeSpec(LibConstants.CLASS_NAME_SINGLE))
        libDependenciesBuilder.addType(buildSingleTypeSpec(LibConstants.CLASS_NAME_VIEW))
        libDependenciesBuilder.addType(buildSingleTypeSpec(LibConstants.CLASS_NAME_TEST))

        libDependenciesBuilder.addType(buildGroupTypeSpec(LibConstants.CLASS_NAME_COMPOSE))
        libDependenciesBuilder.addType(buildGroupTypeSpec(LibConstants.CLASS_NAME_GROUP))

        val sb = StringBuilder()

        FileSpec.builder(LibConstants.PACKAGE_NAME, LibConstants.CLASS_NAME_DEPENDENCIES_OUTER)
            .addType(libDependenciesBuilder.build())
            .build()
            .writeTo(sb)

        return LibConstants.CLASS_NAME_DEPENDENCIES_OUTER to sb.toString().replace("public ", "")
    }

    private fun createPluginGradleCode(): String {
        val sb = StringBuilder()

        sb.append("rootProject.extra.apply {\n")

        PluginConfig::class.sealedSubclasses
            .forEach {
                sb.createPluginGradle(it)
            }

        val configFile = File(currentDir, "version.properties")

        var libVersion = "1.0.0"

        for (line in configFile.readLines()) {
            if (line.startsWith("VERSION_NAME=")) {
                libVersion = line.replace("VERSION_NAME=", "")
                break
            }
        }

        sb.append("    set(\"libDependency\", \"com.github.qiushui95:LibDependency:${libVersion}\")\n")

        sb.append("}")

        return sb.toString()
    }

    private fun StringBuilder.createPluginGradle(clz: KClass<out PluginConfig>) {
        if (clz.isFinal) {
            clz.objectInstance?.let {
                "    set(\"${it.key}\", \"${it.group}:${it.name}:${it.version}\")\n"
            }?.apply(::append)
        } else {
            clz.sealedSubclasses
                .forEach {
                    createPluginGradle(it)
                }
        }
    }

    private fun TypeSpec.Builder.addKdoc(config: DependencyConfig): TypeSpec.Builder {
        listOf(config.remark, config.link)
            .filterNot { it.isBlank() }
            .joinToString("\n")
            .takeUnless { it.isBlank() }
            ?.apply {
                addKdoc(this)
            }

        return this
    }

    private fun DependencyConfig.buildObjectTypeSpec(addKdoc: Boolean = true): TypeSpec {
        return TypeSpec.objectBuilder(this::class.simpleName!!)
            .superclass(ClassName("", LibConstants.CLASS_NAME_DEPENDENCIES_OUTER))
            .run {
                if (addKdoc) {
                    addKdoc(this@buildObjectTypeSpec)
                } else {
                    this
                }
            }
            .addSuperclassConstructorParameter("%S", group)
            .addSuperclassConstructorParameter("%S", name)
            .addSuperclassConstructorParameter("%S", version)
            .addSuperclassConstructorParameter("%T", dependencyMethod.javaClass)
            .build()
    }

    private fun buildSingleTypeSpec(title: String): TypeSpec {
        val interfaceBuilder = TypeSpec.interfaceBuilder(title)

        DependencyConfig::class
            .sealedSubclasses
            .filter { it.qualifiedName?.contains(title) == true }
            .mapNotNull { it.objectInstance }
            .sortedBy { it.sort }
            .map { it.buildObjectTypeSpec() }
            .forEach(interfaceBuilder::addType)

        return interfaceBuilder.build()
    }


    private fun buildGroupTypeSpec(title: String): TypeSpec {
        val interfaceBuilder = TypeSpec.interfaceBuilder(title)

        DependencyConfig::class
            .sealedSubclasses
            .filter { it.qualifiedName?.contains(title) == true }
            .mapNotNull { it.objectInstance }
            .sortedBy { it.sort }
            .map {

                TypeSpec.objectBuilder(it::class.simpleName!!)
                    .superclass(ClassName("", LibConstants.CLASS_NAME_DEPENDENCIES_OUTER))
                    .addKdoc(it)
                    .addSuperclassConstructorParameter("%S", it.group)
                    .addSuperclassConstructorParameter("%S", it.name)
                    .addSuperclassConstructorParameter("%S", it.version)
                    .addSuperclassConstructorParameter("%T", it.dependencyMethod.javaClass)
                    .build()
            }.forEach(interfaceBuilder::addType)

        DependencyConfig::class
            .sealedSubclasses
            .filter { it.qualifiedName?.contains(title) == true }
            .filter {
                it.isSealed
            }
            .map { clz ->
                val children = clz.sealedSubclasses.mapNotNull { it.objectInstance }

                val containerBuilder = TypeSpec.interfaceBuilder(clz.simpleName!!)
                    .addKdoc(children.first())

                children.map { it.buildObjectTypeSpec(false) }
                    .forEach(containerBuilder::addType)

                containerBuilder.build()
            }.forEach(interfaceBuilder::addType)

        return interfaceBuilder.build()
    }

    @Test
    fun createMd() {
        val list = mutableListOf<String>()

        list.addMdLine("# 三方依赖库版本管理[![](https://jitpack.io/v/qiushui95/LibDependency.svg)](https://jitpack.io/#qiushui95/LibDependency)\n")

        list.buildMdSingle(LibConstants.CLASS_NAME_SINGLE)
        list.buildMdSingle(LibConstants.CLASS_NAME_VIEW)
        list.buildMdSingle(LibConstants.CLASS_NAME_TEST)

        list.buildMdGroup(LibConstants.CLASS_NAME_COMPOSE)
        list.buildMdGroup(LibConstants.CLASS_NAME_GROUP)


        val file = File(File("").absoluteFile.parentFile, "ReadMe.md")

        file.createNewFile()
        file.writer().use { writer ->
            list.forEach(writer::append)
        }
    }

    private fun MutableList<String>.addMdLine(line: String) {
        add("$line  \n")
    }

    private fun MutableList<String>.buildMdTitle(
        title: String,
        detailBuilder: MutableList<String>.() -> Unit
    ) {
        addMdLine("<details>")
        addMdLine("<summary>${title}</summary>")
        addMdLine("")

        detailBuilder()

        addMdLine("</details>")

        addMdLine("")
    }

    private fun MutableList<String>.buildMdTitle(
        config: DependencyConfig,
        title: String = config.javaClass.simpleName,
    ) {
        val sb = StringBuilder()
        if (config.link.isNotBlank()) {
            sb.append(">[${title}](${config.link})")
        } else {
            sb.append(">${title}")
        }
        if (config.remark.isNotBlank()) {
            sb.append("(${config.remark})")
        }
        addMdLine(sb.toString())
    }

    private fun MutableList<String>.buildMdSingle(title: String) {
        buildMdTitle(title) {
            DependencyConfig::class
                .sealedSubclasses
                .filter { it.java.canonicalName.split(".").dropLast(1).last() == title }
                .mapNotNull { it.objectInstance }
                .sortedBy { it.sort }
                .forEach { config ->
                    buildMdTitle(config)
                    addMdLine(">>${config.dependencyMethod.method}(\"${config.group}:${config.name}:${config.version}\")")
                    addMdLine("")
                }
        }
    }

    private fun MutableList<String>.buildMdGroup(title: String) {
        buildMdTitle(title) {
            val clzList = DependencyConfig::class
                .sealedSubclasses
                .filter { it.qualifiedName?.contains(title) == true }

            clzList
                .mapNotNull { it.objectInstance }
                .sortedBy { it.sort }
                .forEach { config ->
                    buildMdTitle(config)
                    addMdLine(">>${config.dependencyMethod.method}(${config.group}:${config.name}:${config.version})")
                    addMdLine("")
                }

            clzList.filter { it.isSealed }
                .forEach { parentClz ->
                    val subObjects = parentClz.sealedSubclasses
                        .mapNotNull { it.objectInstance }
                        .sortedBy { it.sort }

                    buildMdTitle(subObjects.first(), parentClz.java.simpleName)

                    subObjects.forEach { config ->
                        addMdLine(">>${config.dependencyMethod.method}(\"${config.group}:${config.name}:${config.version}\")")
                    }
                    addMdLine("")
                }
        }
    }

    @Test
    fun createGradle() {


        val groups = listOf(
            LibConstants.CLASS_NAME_SINGLE,
            LibConstants.CLASS_NAME_VIEW,
            LibConstants.CLASS_NAME_TEST,
            LibConstants.CLASS_NAME_COMPOSE,
            LibConstants.CLASS_NAME_GROUP,
        )

        createGradle(groups)
    }

    private fun createGradle(titles: List<String>) {
        val newestFile = File(File("").absoluteFile.parent, "newest/build.gradle.kts")
        val defineFile = File(File("").absoluteFile.parent, "define/build.gradle.kts")

        doInAllFile(newestFile, defineFile) { it.delete() }
        doInAllFile(newestFile, defineFile) { it.createNewFile() }

        doInAllFile(newestFile, defineFile) {
            it.appendText(
                """plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp") version "1.6.10-1.0.4"
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 24
        targetSdk = 31
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
"""
            )
        }



        titles.forEach { title ->


            val clzList = DependencyConfig::class
                .sealedSubclasses
                .filter { it.qualifiedName?.contains(title) == true }

            clzList
                .mapNotNull { it.objectInstance }
                .sortedBy { it.sort }
                .forEach { config ->
                    newestFile.appendText(getDependency(config, "+"))
                    defineFile.appendText(getDependency(config))
                }

            clzList.filter { it.isSealed }
                .forEach { parentClz ->
                    doInAllFile(newestFile, defineFile) { it.appendText("\n") }


                    parentClz.sealedSubclasses
                        .mapNotNull { it.objectInstance }
                        .sortedBy { it.sort }
                        .forEach { config ->

                            newestFile.appendText(getDependency(config, "+"))
                            defineFile.appendText(getDependency(config))
                        }

                }
            doInAllFile(newestFile, defineFile) { it.appendText("\n") }
        }

        doInAllFile(newestFile, defineFile) { it.appendText("}") }
    }

    private fun doInAllFile(vararg files: File, block: (File) -> Unit) {
        files.forEach(block)
    }

    private fun getDependency(config: DependencyConfig, version: String = config.version): String {
        return "    ${config.dependencyMethod.method}(\"${config.group}:${config.name}:${version}\")\n"
    }
}