package com.github.akm0d.pycharmpop.services

import com.github.akm0d.pycharmpop.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
