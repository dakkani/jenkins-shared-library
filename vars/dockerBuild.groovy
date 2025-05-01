// vars/dockerBuild.groovy
def call(String imageName, String buildArgs = '') {
    echo "Building Docker image: ${imageName}"
    def args = buildArgs ? "--build-arg ${buildArgs}" : ''
    sh "docker build ${args} -t ${imageName} ."
}
