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
                    attendance.checkoutgit('https://github.com/Suryavanshiaditya1999/attendace.git', 'master')
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
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        attendance.call_unit_testing()
                    }
                }
            }
        }
        
        stage('Dependency') {
            steps {
                script {
                    attendance.call_dependency()
                }
            }
        }
       
        
    }
}
