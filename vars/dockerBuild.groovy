// vars/dockerBuild.groovy
def call(String imageName, String dockerfile = 'Dockerfile', String buildArgs = '') {
    echo "Building Docker image: ${imageName} using Dockerfile: ${dockerfile}"
    def args = buildArgs ? "--build-arg ${buildArgs}" : ''
    sh "docker build -f ${dockerfile} ${args} -t ${imageName} ."
}
