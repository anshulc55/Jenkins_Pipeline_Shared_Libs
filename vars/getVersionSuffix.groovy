def call(Map config) {
    node {
    if (config.isReleaseCandidate) {
            return config.RELEASE_VER + ':' + env.BUILD_NUMBER
    } else {
            return config.INT_VER + '+ci:' + env.BUILD_NUMBER
        }
    }
}
