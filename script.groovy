def initApp(){
    echo 'starting the jobs...'
}
def buildApp(){
    echo 'building the app...'
    sh 
}
def testApp(){
    echo 'testing the jobs...'
    
}
def depolyApp(){
    echo 'depolying the app...'
    echo "deployng version ${params.VERSION}"
}
return this
