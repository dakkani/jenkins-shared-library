// vars/dockerBuild.groovy
def call(String imageName, String buildArgs = '') {
    echo "Building Docker image: ${imageName}"
    sh "docker build ${buildArgs ? "--build-arg ${buildArgs}" : ''} -t ${imageName} ."
}
