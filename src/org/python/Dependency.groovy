package org.python

def call() {
    sh '''
      python3 -m venv myenv
      . myenv/bin/activate
      echo "Workspace directory: ${workspaceDir}"
      pip install -r requirments.txt
      ${DEPENDENCY_CHECK_HOME}/bin/dependency-check.sh --scan . --format HTML
    '''
    archiveArtifacts artifacts: '**/dependency-check-report.html', allowEmptyArchive: true
}
