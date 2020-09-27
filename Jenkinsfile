pipeline {

  stages {
    stage('Source') { // Get code
      steps {
        // get code from our Git repository
        echo 'Getting Source...'
        git 'https://github.com/GerryJ0/mongo'
      }
    }
    stage('Compile') { // Compile and do unit testing
      tools {
        gradle 'GRADLE_HOME'
      }
      steps {
        // run Gradle to execute compile and unit testing
        echo 'Building...'
        sh 'gradle clean compileJava test'
      }
    }
  }
}