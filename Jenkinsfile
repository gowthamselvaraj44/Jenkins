pipeline {
    agent any
	tools{
	maven 'maven'
}
    stages {
        stage('Build Jar') {
            steps {
                echo 'Build package Application'
		sh 'mvn package'
            }
        }

    stages {
        stage('Build Image') {
            steps {
                echo 'Build docker image'
		sh 'docker build -t gowthamdocker44/test:2.0 .'
		sh "echo 'Gowtham@99' | docker login  -u 'gowthamdocker44' --password-stdin"
		sh 'docker push gowthamdocker44/test:2.0'
            }
        }

    stages {
        stage('deploy') {
            steps {
                echo 'deployed in to docker hub'
            }
        }

    }
}
