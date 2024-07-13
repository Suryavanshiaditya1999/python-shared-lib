package org.python

def call() {
    def workspaceDir = "${env.WORKSPACE}"
    echo "Current directory: ${pwd()}"
    echo "Workspace directory: ${workspaceDir}"
    sh """
        ls -la ${workspaceDir}
        python3 -m venv myenv
        . myenv/bin/activate
        echo "Workspace directory: ${workspaceDir}"
        pip install -r ${workspaceDir}/requirements.txt
        pip install coverage
        pip install pytest
        coverage run -m pytest
        coverage report -m
    """
}
