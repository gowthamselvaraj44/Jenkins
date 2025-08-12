#!/usr/bin/env groovy

pipeline {
    agent none
     parameters{
            choice(name: 'VERSION', choices: ['1.1.0','1.2.0'], description: '')
            booleanParam(name: 'exectest' defaultValue: true, description: '')
        }
    stages {
        stage('build') {
            steps {
                script {
                    echo "Building the application..."
                }
            }
        }
        stage('test') {
            when{
                expression{
                    params.exectest
                }
            }

            steps {
                script {
                    echo "Testing the application..."
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "Deploying the application..."
                    echo "deploying version ${params.VERSION}"
                }
            }
        }
    }
}
