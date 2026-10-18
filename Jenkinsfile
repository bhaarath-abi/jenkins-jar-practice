//update 2 Jenkinsfile for testing
pipeline {
    agent any

    stages {
       stage('checkout') {
          steps {
             git branch: 'main', url: 'https://github.com/bhaarath-abi/jenkins-jar-practice.git'
          }
       }
    
       stage('Compile') {
          steps {
             sh 'javac -d out YourProgram.java'
          }
       }

       stage('Package JAR') {
          steps {
             sh 'jar cvf YourProgram.jar -C out .'
          }
        }

        stage('Run JAR') {
           steps {
              sh 'java -jar YourProgram.jar'
           }
        }
    }
}
