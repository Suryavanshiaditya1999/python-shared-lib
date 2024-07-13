// import org.python.Coverage
import org.python.Checkout
import org.python.SonarQube
// import org.python.Dependency

// import org.python.UnitTesting


def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}

// def callCoverage() {
//     new Coverage.call()
// }

def callSonarqube() {
    new Sonarqube().call()
}

// def callDependency() {
//     new Dependency().call()
// }



// def callUnitTesting() {
//     new UnitTesting().call()
// }
