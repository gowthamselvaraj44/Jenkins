#!/usr/bin/env groovy
def gv
pipeline {
    agent none
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
        booleanParam(name: 'exectest', defaultValue: true, description: '')
    }
    stages {

        stage('init') {
            steps {
                script {
                    gv=load.script.groovy
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
            steps {
                script {
                 gv.deployApp()
                }
            }
        }
    }
}
