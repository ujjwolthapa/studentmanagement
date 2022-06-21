pipeline{
    agent any
    tools{
        maven "maven-3.6"
    }
    stages{
        stage('build jar'){
            steps{
                echo "building the application..."
                sh 'mvn package'
            }
        }
           stage('build image'){
            steps{
                echo "building the docker image..."
                withCredentials([usernamePassword(credentialsId: 'docker-hub-repo',passwordVariable:'PASS',usernameVariable:'USER')]){
                    sh 'docker build -t bromx/my-repo:student-1.0'
                    sh "echo $PASS | docker login -u $USER --password-stdin"
                    sh 'docker push bromx/my-repo:student-2.0'
                }
            }
        }
        stage("depoly")
        steps{
            script{
                echo "deploying application"
            }
        }
    }
}