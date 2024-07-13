@Library('shared-lib') _

pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('SONARQUBE_TOKEN') // Replace with your credential ID
    }
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    attendance.checkoutgit('https://github.com/OT-MICROSERVICES/attendance-api.git', 'main')
                }
            }
        }
        stage('Sonarqube') {
            steps {
                script {
                    attendance.sonarqubecall('attendance-api', './', SONARQUBE_TOKEN)
                }
            }
        }
        stage('Unit Testing') {
            steps {
                script {
                    attendance.call_unit_testing()
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
