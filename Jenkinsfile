pipeline {
   tools {
        maven 'Maven3'
    }
    agent any
    environment {
        registry = "490004656937.dkr.ecr.us-east-1.amazonaws.com/devops/my-docker-repo"
    }
   
    stages {
        stage('Cloning Git') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '', url: 'https://github.com/habtomab/docker-kubernate-spring-boot']]])
            }
        }
      stage ('Build') {
          steps {
            sh 'mvn clean install'           
            }
      }
    // Building Docker images
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry 
        }
      }
    }
   
   
    }
}
