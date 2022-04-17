package com.github.dwillett.genqlientintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.dwillett.genqlientintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
