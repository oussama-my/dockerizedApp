pipeline {
    agent any
     tools {
        // Specify the tool name you configured in Jenkins
        maven 'Maven'
    }
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
