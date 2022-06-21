def gv
pipeline{
    agent any
        parameters{
        choice(name:'VERSION',choices:['1.1.0','1.2.0','1.3.0'],description:'')
        booleanParam(name:'executeTests',defaultValue:true,description:'')
    }
    tools{
        maven "maven-3.6"
    }
    stages{
        stage('init'){
            steps{
                script{
                    gv = load "script.groovy"
                    gv.initApp()
                }
            }
        }
        stage('build'){
            steps{
                script{
                    gv.buildApp()
                }
            }
            
        }
        stage('test'){
            when{
                expression{
                    params.executeTests
                }
            }
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage('depoly'){
            input{
                message "select the enviroment to deploy"
                ok "Done"
                parameters{
                    choice(name:'ENV',choices:['dev','stag','pro'],description:'')
                }
            }
            steps{
                script{
                    gv.depolyApp()
                    echo "Depolying to ${ENV}"
                }
            }
        }
    }
}