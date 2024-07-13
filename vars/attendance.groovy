// 
import org.python.Checkout
import org.python.Sonarqube
import org.python.Dependency
// import org.python.Coverage
// import org.python.UnitTesting


def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}



def sonarqubecall(String projectKey, String sourcesDir, String sonarToken) {
    new Sonarqube().call(projectKey, sourcesDir, sonarToken)
}

def callDependency() {
    new Dependency().call()
}

// def callCoverage() {
//     new Coverage.call()
// }



// def callUnitTesting() {
//     new UnitTesting().call()
// }
