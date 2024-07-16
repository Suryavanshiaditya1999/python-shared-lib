import org.python.Sonarqube
import org.python.Dependency
import org.python.UnitTesting
import org.python.CodeCoverage

def sonarqubecall(String projectKey, String sourcesDir, String sonarToken) {
    new Sonarqube().call(projectKey, sourcesDir, sonarToken)
}

def call_unit_testing() {
    new UnitTesting().call()
}

def call_coverage() {
    new CodeCoverage().call()
}

def calldependency() {
    new Dependency().call()
}


