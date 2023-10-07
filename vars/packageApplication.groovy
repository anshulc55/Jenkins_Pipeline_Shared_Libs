def call() {
    node {
      dir('./java-tomcat-sample'){
        sh '''
          mvn versions:set -DnewVersion="${VERSION_SUFFIX}"-SNAPSHOT
          mvn versions:update-child-modules
          mvn clean package
      '''
    }
  }
}
