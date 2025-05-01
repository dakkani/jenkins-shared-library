// vars/mavenBuild.groovy
def call(String pomFile = 'pom.xml', String goals = 'clean install') {
    echo "Starting Maven build with POM: ${pomFile} and goals: ${goals}"
    sh "mvn -f ${pomFile} ${goals}"
}
