package gradle.build

import org.gradle.kotlin.dsl.DependencyHandlerScope
import son.ysy.dependencies.DependencyMethod
import son.ysy.dependencies.LibDependencies

fun DependencyHandlerScope.dependency(
    dependency: LibDependencies,
    group:String=dependency.group,
    name:String=dependency.name,
    version:String=dependency.version,
    method: DependencyMethod = dependency.dependencyMethod
) {
    add(method.method, "${group}:${name}:${version}")
}