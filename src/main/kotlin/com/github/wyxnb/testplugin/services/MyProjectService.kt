package com.github.wyxnb.testplugin.services

import com.intellij.openapi.project.Project
import com.github.wyxnb.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
