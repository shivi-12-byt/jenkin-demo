pipeline {
    agent any

    stages {

        stage('Pull') {
            steps {
                git 'https://github.com/shivi-12-byt/jenkin-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh '''
                    mvn clean package
                    echo "We are in build stage"
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    echo "We are in test stage"
                '''
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    echo "We are in deploy stage"
                '''
            }
        }

    }
}
