package com.github.chengdp.intellijplugincommitlinkaone.services

import com.github.chengdp.intellijplugincommitlinkaone.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
