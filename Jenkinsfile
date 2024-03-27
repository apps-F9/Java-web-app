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
        stage('AWS-Profile') {
            steps {
                script {
                    withCredentials([[
                        $class: 'AmazonWebServicesCredentialsBinding',
                        credentialsId: 'AWS',
                        accessKeyVariable: 'AWS_ACCESS_KEY_ID',
                        secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
                    ]]) {
                        sh '''
                        aws configure set aws_access_key_id $AWS_ACCESS_KEY_ID
                        aws configure set aws_secret_access_key $AWS_SECRET_ACCESS_KEY
                        aws configure set region us-east-1
                        aws configure list
                        '''
                    }
                }
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