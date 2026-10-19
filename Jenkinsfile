//update 4 Jenkinsfile for testing
pipeline {
    agent any

    stages {
        stage('Sanity Check') {
            steps {
                sh '/usr/bin/git --version'
                sh 'java -version'
            }
        }

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/bhaarath-abi/jenkins-jar-practice.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mkdir -p out'
                sh 'javac -d out HelloWorld.java'
            }
        }

        stage('Package JAR') {
            steps {
                sh 'jar cvf HelloWorld.jar -C out .'
            }
        }

        stage('Run JAR') {
            steps {
                sh 'java -jar HelloWorld.jar'
            }
        }
    }
}
