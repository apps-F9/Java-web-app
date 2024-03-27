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
        stage('Run') {
            steps {
                sh '''
                java -jar target/mywebapp:1.0-SNAPSHOT
                '''
            }
        }
    }
}