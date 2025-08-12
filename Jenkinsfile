#!/usr/bin/env groovy
def gv
pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
        booleanParam(name: 'exectest', defaultValue: true, description: '')
    }
    stages {

        stage('init') {
            steps {
                script {
                    gv=load 'script.groovy'
                }
            }
        }
        
        
        stage('build') {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage('test') {
            when {
                expression {
                    params.exectest
                }
            }
            steps {
                script {
                   gv.testApp()
                }
            }
        }
        stage('deploy') {
            input {
                message "select the deployment env"
                ok "Done"
                parameters {
                    choice(name:'ENV', choices: ['dev','staging','prod'], description: 'for deployment purposes')
                }
            }
            steps {
                script {
                 gv.deployApp()
                }
            }
        }
    }
}
