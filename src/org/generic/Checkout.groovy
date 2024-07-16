package org.python

def call(String gitUrl, String branch = 'main') {
    stage('Checkout Git') {
        script {
            git url: gitUrl, branch: branch
            echo "Checked out repository from ${gitUrl} on branch ${branch}"
        }
    }
}
