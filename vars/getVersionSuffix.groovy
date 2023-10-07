def call(Map config) {
    node {
        if (config.isReleaseCandidate) {
            return env.RELEASE_VERSION + ':' + env.BUILD_NUMBER
    } else {
            return env.INT_VERSION + '+ci:' + env.BUILD_NUMBER
        }
    }
}
