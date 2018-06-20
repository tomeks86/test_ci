pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh 'mvn clean test'
      }
    }
    stage('install') {
      steps {
        sh 'mvn install'
      }
    }
  }
}