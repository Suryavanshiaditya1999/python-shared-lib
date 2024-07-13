// import org.python.Coverage
import org.python.Dependency
// import org.python.SonarQube
// import org.python.UnitTesting
import org.python.Checkout

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}

// def callCoverage() {
//     new Coverage.call()
// }

def callDependency() {
    new Dependency().call()
}

// def callSonarqube() {
//     new UnitTesting().call()
// }

// def callUnitTesting() {
//     new UnitTesting().call()
// }
