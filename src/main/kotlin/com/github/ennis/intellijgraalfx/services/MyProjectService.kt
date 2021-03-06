package com.github.ennis.intellijgraalfx.services

import com.github.ennis.intellijgraalfx.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
