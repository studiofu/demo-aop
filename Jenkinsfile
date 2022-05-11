pipeline {
  agent any
  stages {
    stage('Pre-Build') {
      parallel {
        stage('pre-build') {
          steps {
            echo 'this is pre-build step'
            sh 'echo "ok. this is pre build steps"'
          }
        }

        stage('pre-build-2') {
          agent any
          steps {
            sleep 15
          }
        }

      }
    }

    stage('Shrug') {
      steps {
        sh '''echo "shrug"
sleep 3'''
      }
    }

    stage('Build') {
      steps {
        sh '''ls -ltr

mvn clean package
'''
      }
    }

  }
}