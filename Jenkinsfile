//commit with changes


pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh '''
                javac --release HelloWorld.java
                jar cvf HelloWorld.jar HelloWorld.class
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                timeout 15 java -cp HelloWorld.jar HelloWorld &
                APP_PID=$!

                sleep 5

                RESPONSE=$(curl -s http://localhost:8090)

                echo "Response: $RESPONSE"

                kill $APP_PID || true

                echo "$RESPONSE" | grep "Hello from version4"
                '''
            }
        }

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
