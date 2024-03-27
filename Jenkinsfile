pipeline {
    agent {
        label 'java'
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                mvn -X package
                '''
            }
        }
        stage('Docker') {
            steps {
                sh '''
                docker image build -t java-web-app:1.0 .
                '''
            }
        }
    }
}