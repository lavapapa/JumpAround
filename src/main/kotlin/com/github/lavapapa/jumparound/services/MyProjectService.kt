package com.github.lavapapa.jumparound.services

import com.github.lavapapa.jumparound.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
