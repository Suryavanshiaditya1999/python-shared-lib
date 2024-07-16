import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.Trivyinstaller
import org.generic.Notification

def checkout(String url, String creds, String branch) {
    new Checkout().call(url, creds, branch)
}

 def gitleaks() {
     new Gitleaks().call()
 }

def trivyinstaller(String repoUrl) {
     new Trivyinstaller().call(url)
 }

def notification() {
    new Notification().call()
}