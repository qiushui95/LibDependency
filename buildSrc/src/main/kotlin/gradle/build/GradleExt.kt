package gradle.build

import org.gradle.kotlin.dsl.DependencyHandlerScope
import son.ysy.dependencies.DependencyMethod
import son.ysy.dependencies.LibDependencies

fun DependencyHandlerScope.dependency(
    dependency: LibDependencies,
    method: DependencyMethod = dependency.dependencyMethod
) {
    add(method.method, "${dependency.group}:${dependency.name}:${dependency.version}")
}