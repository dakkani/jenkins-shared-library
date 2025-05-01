// vars/dockerPush.groovy
def call(String imageName, String registry = '') {
    echo "Pushing Docker image: ${imageName} to ${registry}"
    def fullImageName = registry ? "${registry}/${imageName}" : imageName
    sh "docker push ${fullImageName}"
}
