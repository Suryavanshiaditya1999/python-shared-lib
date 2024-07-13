package org.python

def call() {
    sh '''
      if [ ! -e /usr/bin/python ]; then
      ln -s /usr/bin/python3 /usr/bin/python
      fi
      python3 -m venv myenv
      . myenv/bin/activate
      snyk test --file=poetry.lock
    '''
}
