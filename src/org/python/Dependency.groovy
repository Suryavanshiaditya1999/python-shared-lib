package org.python

def call() {
    sh '''
       python3 -m venv myenv
       . myenv/bin/activate
       ln -s /usr/bin/python3 /usr/bin/python
       snyk test --file=poetry.lock
    '''
}
