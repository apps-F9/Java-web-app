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
                aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 379217058080.dkr.ecr.us-east-1.amazonaws.com
                sudo docker build -t test .
                sudo docker tag test:latest 379217058080.dkr.ecr.us-east-1.amazonaws.com/test:latest
                sudo docker push 379217058080.dkr.ecr.us-east-1.amazonaws.com/test:latest
                '''
            }
        }
    }
}