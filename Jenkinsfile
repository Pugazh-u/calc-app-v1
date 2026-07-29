pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Pugazh-u/calc-app-v1.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Testing') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'build complete'
        }
        failure {
            echo 'build failure'
        }
    }
}