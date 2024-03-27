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
                java -jar target/webapp-0.0.1-SNAPSHOT.jar
                '''
            }
        }
    }
}