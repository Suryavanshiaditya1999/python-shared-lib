import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.Trivyinstaller


def checkout_git(String url, String creds, String branch = 'main') {
    new Checkout().call(url, creds, branch)
}

 def gitleaks() {
     new Gitleaks().call()
 }

def trivyinstaller(String repoUrl) {
     new Trivyinstaller().call(url)
 }
