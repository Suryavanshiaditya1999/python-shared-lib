package org.generic

def call(String url) {   //github-token is git token, stored in jenkins as secret text
    withCredentials([string(credentialsId: 'github-token', variable: 'GITHUB_TOKEN')]) {
        sh "trivy repo ${url} --format json -o trivy-license-report.json"
    }
}
