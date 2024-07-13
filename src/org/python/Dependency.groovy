package org.python

def call() {
    sh '''
      python3 -m venv myenv
      . myenv/bin/activate
      pip install snyk
      snyk test --file=poetry.lock
    '''
}