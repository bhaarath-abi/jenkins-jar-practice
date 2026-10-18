//update 3 Jenkinsfile for testing
pipeline {
    agent any

    tools {
        git 'Default'
    }


    stages {
       stage('checkout') {
          steps {
             git branch: 'main', url: 'https://github.com/bhaarath-abi/jenkins-jar-practice.git'
          }
       }
    
       stage('Compile') {
          steps {
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
