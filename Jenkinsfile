@Library('shared-lib') _

node {
    // Environment variables
    env.SONARQUBE_TOKEN = credentials('SONARQUBE_TOKEN')
    env.DEPENDENCY_CHECK_HOME = tool 'Dependency-Check'  // Replace with your credential ID

    try {
        stage('git checkout') {
            attendance.checkoutgit('https://github.com/Suryavanshiaditya1999/attendace.git', 'master')
        }

        stage('Sonarqube') {
            attendance.sonarqubecall('attendance-api', './', SONARQUBE_TOKEN)
        }

        stage('Coverage') {
            catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                echo 'coverage'
                attendance.call_coverage()
            }
        }

        stage('Unit Testing') {
            catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                echo 'Testing'
                attendance.call_unit_testing()
            }
        }

        stage('Dependency') {
            catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                attendance.calldependency()
            }
        }
    } catch (Exception e) {
        currentBuild.result = 'FAILURE'
        throw e
    }
}
