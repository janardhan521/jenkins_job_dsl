job('DSL_MAVEN_JOB') {
    description("Jenkin Job configuration using DSL")
    logRotator(2, 2)
    scm {
        github('https://github.com/janardhan521/devops.git', 'main')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps {
        maven('clean test install','pom.xml')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}