
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Code is available in Jenkins workspace'
            }
        }

        stage('Validate') {
            steps {
                sh 'test -s index.html'
                echo 'Website file validation successful!'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Next we will configure deployment to the EC2 web server'
            }
        }
    }
}
