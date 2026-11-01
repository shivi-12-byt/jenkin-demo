pipeline {
    agent { 
        label 'webserver'
    }

    stages {
        stage('Pull') {
            steps {
                sh 'echo "This is pull stage"'
            }
        }

        stage('Build') {
            steps {
                sh 'echo "This is build stage"'
            }
        }

        stage('Test') {
            steps {
                sh 'echo "This is test stage"'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "This is deploy stage"'
            }
        }
    }
}
