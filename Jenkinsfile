def gv
pipeline{
    agent any
    tools{
        maven "maven-3.6"
    }
    stages{
        stage('init'){
            steps{
                script{
                    echo"starting the job"
                    gv = load "script.groovy"
                }
            }
        }
        stage('build jar'){
            steps{
                script{
                 gv.buildApp()
                }
            }
        }
        stage('build image'){
            steps{
                script{
                 gv.buildApp()
                    
                }
            }
        }
        stage('depoly'){
            steps{
                script{
                    gv.depolyApp()
                }
            }
        }
    }
}
