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
        stage('Dependency check') {
            steps {
                script {
                    attendance.callCoverage()
                }
            }
        }
        stage('Coverage') {
            steps {
                script {
                    attendance.callDependency()
                }
            }
        }
        
    }
}
