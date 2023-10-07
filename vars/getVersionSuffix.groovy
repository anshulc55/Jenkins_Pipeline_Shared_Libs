def call(Map config) {
    node {
        if (config.isReleaseCandidate) {
            return config.RELEASE_VERSION + ':' + env.BUILD_NUMBER
    } else {
            return config.INT_VERSION + '+ci:' + env.BUILD_NUMBER
        }
    }
}
