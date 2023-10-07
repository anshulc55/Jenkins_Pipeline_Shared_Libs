def call(Map config) {
  node {
        dir(config.originalWorkspace) { 
        sh '''
            mvn versions:set -DnewVersion="${VERSION_SUFFIX}"-SNAPSHOT
            mvn versions:update-child-modules
            mvn clean package
        '''
        }
  }
}