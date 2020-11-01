package com.github.felipetozato.intellijplugindataclassbuilder.services

import com.intellij.openapi.project.Project
import com.github.felipetozato.intellijplugindataclassbuilder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
