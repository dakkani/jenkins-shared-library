// vars/dockerPush.groovy
def call() {
    def imageName = 'omer2k1/hiring-app:latest'
    echo "Pushing Docker image: ${imageName}"
    withCredentials([usernamePassword(credentialsId: 'docker-id', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
        sh "docker push ${imageName}"
    }
}
