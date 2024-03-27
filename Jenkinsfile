pipeline {
    agent {
        label 'java'
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                mvn -X clean package
                '''
            }
        }
    }
}