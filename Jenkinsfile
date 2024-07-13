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
        stage('Sonarqube') {
            steps {
                script {
                    attendance.sonarqubecall('attendance-api', './', SONARQUBE_TOKEN)
                }
            }
        }
        // stage('Dependency') {
        //     steps {
        //         script {
        //             attendance.callDependency()
        //         }
        //     }
        // }
        // stage('Sonarqube') {
        //     steps {
        //         script {
        //             attendance.callSonarqube()
        //         }
        //     }
        // }
        
    }
}
