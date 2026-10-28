
pipeline {
    agent any

    environment {
        WEB_HOST = '16.16.24.40'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Validate') {
            steps {
                sh 'test -s index.html'
                echo 'Validation successful'
            }
        }

        stage('Deploy') {
            steps {
                sshagent(credentials: ['web-deploy-key']) {
                    sh '''
                        set -eu

                        scp index.html ubuntu@$WEB_HOST:/tmp/index.html

                        ssh ubuntu@$WEB_HOST \
                          'sudo install -o root -g root -m 644 /tmp/index.html /var/www/html/index.html && rm -f /tmp/index.html'
                    '''
                }
            }
        }
    }
}
