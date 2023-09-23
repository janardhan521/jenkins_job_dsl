job('DSL_MAVEN_JOB') {
    description("Jenkin Job configuration using DSL")
    logRotator(2, 2)
    scm {
        github('janardhan521/devops', 'main')
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