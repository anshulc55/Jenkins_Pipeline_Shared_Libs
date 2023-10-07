def call() {
  node {
      sh '''
        git version
        java -version
        mvn -version
      '''
  }
}
 