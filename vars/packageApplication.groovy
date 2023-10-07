def call() {
    node {
        sh '''
        mvn versions:set -DnewVersion="${VERSION_SUFFIX}"-SNAPSHOT
        mvn versions:update-child-modules
        mvn clean package
      '''
    }
}
