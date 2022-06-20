// CODE_CHANGES=getGitChanges()
// def gv
pipeline {
    agent any
    parameters{
        choice(name:'VERSION',choices:['1.1.0','1.2.0','1.3.0'],description:'')
        booleanParam(name:'executeTests',defaultValue:true,description:'')
    }
    tools{
        maven 'maven-3.6'
    }

    stages {
        stage('init'){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage('Build') {
            // expression{
            //     env.BRANCH_NAME=='main' && CODE_CHANGES == true
            // }
            steps {
                scrip{
                    gv.buildApp()
                }
                // sh "mvn install"
            }
        }
        stage('Test') {
            // when{
            //     expression{
            //         ${env.BRANCH_NAME} == 'main'
            //     }
            // }
            steps {
                gv.testApp()
            }
        }
        stage('Deploy') {
            steps {
                script{
                    gv.deployApp()
                    echo "depolying version ${VERSION}"
                }
            }
        }
    }
}