#!/user/bin/env groovy

def call(String ImageName) {
  echo "building the docker image..."
    withCredentials([
        usernamePassword(
            credentialsId: 'dockerhub-repo', 
            usernameVariable: 'USERNAME', 
            passwordVariable: 'PASSWORD')]) {
                sh "docker build -t $ImageName ."
                sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin'
                sh "docker push $ImageName"
    }
}