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
                    def gv = load "./script.goovy"
                }
            }
        }
        stage('build'){
            steps{
                gv.buildApp()
            }
            
        }
        stage('test'){
            steps{
                echo 'testing'
            }
        }
        stage('depoly'){
            steps{
                echo'depolying'
            }
        }
    }
}