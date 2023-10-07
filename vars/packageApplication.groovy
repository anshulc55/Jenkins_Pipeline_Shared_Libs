def call() {
  node {
      sh '''
        mvn -f java-tomcat-sample/pom.xml versions:set -DnewVersion="${VERSION_SUFFIX}"-SNAPSHOT
        mvn -f java-tomcat-sample/pom.xml versions:update-child-modules
        mvn -f java-tomcat-sample/pom.xml clean package
    '''
  }
}