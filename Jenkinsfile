pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                bat 'mvn test'
                bat 'mvn install'
                bat 'mvn package'
                archiveArtifacts artifacts: 'target/DockerizedApp.zip'
            }
        }
    }
}
