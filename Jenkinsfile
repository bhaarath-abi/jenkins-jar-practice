//commit with changes
pipeline {
    agent any

    stages {

        stage('Upload Artifact To S3') {
            steps {
                sh '''
                aws s3 cp HelloWorld.jar s3://git-to-s3artifacts/
                aws s3 cp Dockerfile s3://git-to-s3artifacts/ 
                '''
            }
        }
    }
}
