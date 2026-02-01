def call(String projectName) {
    echo "Building project: ${projectName}"
    sh "mvn clean package"
}
