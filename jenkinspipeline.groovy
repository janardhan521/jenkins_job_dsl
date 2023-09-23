pipeline{
    agent any
    stages{
      stage('Init'){
          steps{
            echo 'Hi, am initial stage of jenkins pipe line job'
            echo 'exis the initil stage'
          }
      }
      stage('Build'){
          steps{
            echo 'Hi, am Build stage of jenkins pipe line job'
            echo 'exis the Build stage'
          }
      }
      stage('Deploy'){
          steps{
            echo 'Hi, am Deploy stage of jenkins pipe line job'
            echo 'exis the Deploy stage'
          }
      }
    }
}