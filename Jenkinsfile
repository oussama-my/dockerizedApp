pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh 'mvn test'
                sh 'mvn install'
                sh 'mvn package'
                archiveArtifacts artifacts: 'target/DockerizedApp.zip'
            }
        }
    }
}
