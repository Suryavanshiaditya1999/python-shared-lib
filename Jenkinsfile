@Library('shared-lib') _

pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    attendance.checkoutgit('https://github.com/OT-MICROSERVICES/attendance-api.git', 'main')
                }
            }
        }
        stage('Coverage') {
            steps {
                script {
                    attendance.callCoverage()
                }
            }
        }
        stage('Dependency') {
            steps {
                script {
                    attendance.callDependency()
                }
            }
        }
        
    }
}
