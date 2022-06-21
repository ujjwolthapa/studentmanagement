def initApp(){
    echo 'starting the jobs...'
}
def buildApp(){
    echo 'building the app...'
    sh 'mvn --version'
    echo "building application jar"
    sh 'mvn package'
}
def testApp(){
    echo 'testing the jobs...'
    
}
def buildImage(){
       echo "building the docker image"
       withCredentials([usernamePassword(credentialsId: 'docker-hub-repo',passwordVariable:'PASS',usernameVariable:'USER')]){
        sh 'docker build -t bromx/my-repo:student-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push bromx/my-repo:student-2.0'                                        
       }
}
def depolyApp(){
    echo 'depolying the app...'
    
}
return this
