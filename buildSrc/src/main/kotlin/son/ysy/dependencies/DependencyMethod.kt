package son.ysy.dependencies

sealed class DependencyMethod(val method: String) {
    object Api : DependencyMethod("api")
    object Implementation : DependencyMethod("implementation")
    object CompileOnly : DependencyMethod("compileOnly")
    object RuntimeOnly : DependencyMethod("runtimeOnly")
    object Kapt : DependencyMethod("kapt")
    object Ksp : DependencyMethod("ksp")
    object Classpath : DependencyMethod("classpath")

    sealed class Debug(value: String) : DependencyMethod("debug$value") {
        object Api : Debug("Api")
        object Implementation : Debug("Implementation")
        object CompileOnly : Debug("CompileOnly")
        object RuntimeOnly : Debug("RuntimeOnly")
        object Kapt : Debug("Kapt")
        object Ksp : Debug("Ksp")
    }

    sealed class Release(value: String) : DependencyMethod("release$value") {
        object Api : Release("Api")
        object Implementation : Release("Implementation")
        object CompileOnly : Release("CompileOnly")
        object RuntimeOnly : Release("RuntimeOnly")
        object Kapt : Release("Kapt")
        object Ksp : Release("Ksp")
    }

    sealed class Test(value: String) : DependencyMethod("test$value") {
        object Api : Test("Api")
        object Implementation : Test("Implementation")
        object CompileOnly : Test("CompileOnly")
        object RuntimeOnly : Test("RuntimeOnly")
        object Kapt : Test("Kapt")
        object Ksp : Test("Ksp")
    }

    sealed class AndroidTest(value: String) : DependencyMethod("androidTest$value") {
        object Api : AndroidTest("Api")
        object Implementation : AndroidTest("Implementation")
        object CompileOnly : AndroidTest("CompileOnly")
        object RuntimeOnly : AndroidTest("RuntimeOnly")
        object Kapt : AndroidTest("Kapt")
        object Ksp : AndroidTest("Ksp")
    }
}
