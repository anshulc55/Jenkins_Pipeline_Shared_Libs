def call() {
    node {
      dir('./java-tomcat-sample'){
        sh 'ls'
        sh 'pwd'
        sh '''
          mvn versions:set -DnewVersion="${VERSION_SUFFIX}"-SNAPSHOT
          mvn versions:update-child-modules
          mvn clean package
      '''
    }
  }
}
