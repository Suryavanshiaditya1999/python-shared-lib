@Library('shared-lib') _

pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('SONARQUBE_TOKEN')
        DEPENDENCY_CHECK_HOME = tool 'Dependency-Check'  // Replace with your credential ID
    }
    
    stages {
        
        stage('git checkout') {
            steps {
                script {
                    generic.checkout_git('https://github.com/Suryavanshiaditya1999/attendace.git', 'master')
                }
            }
        }

        stage('Coverage') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'gitleaks'
                        generic.gitleaks()
                    }
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

        stage('Coverage') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'coverage'
                        attendance.call_coverage()
                    }
                }
            }
        }

        stage('Unit Testing') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                         echo 'Testing'
                         attendance.call_unit_testing()
                    }
                }
            }
        }

        stage('Dependency') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        attendance.calldependency()
                    }
                }
            }
        }
        
               
    }
}
