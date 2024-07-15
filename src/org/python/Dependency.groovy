package org.python

class DependencyCheck {
    static void execute(script) {
                // Run Dependency-Check using the defined tool installation
            script.sh '''
               python3 -m venv myenv
               . myenv/bin/activate
               echo "Workspace directory: ${workspaceDir}"
               pip install -r ${workspaceDir}/requirments.txt
               ${DEPENDENCY_CHECK_HOME}/bin/dependency-check.sh --scan . --format HTML
            '''
            script.archiveArtifacts artifacts: '**/dependency-check-report.html', allowEmptyArchive: true

        }
    }
