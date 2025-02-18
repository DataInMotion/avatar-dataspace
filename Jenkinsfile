pipeline  {
    agent any

    tools {
        jdk 'OpenJDK17'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage('Build') {

            steps {
                echo "I am building app on branch: ${env.GIT_BRANCH}"
                sh "./gradlew clean build -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"   
            }
        }
        stage('Integration Tests') {

            steps {
                 script {                                                                                         
                    echo "I am running integration tests on branch: ${env.GIT_BRANCH}"
                    try {
                        sh './gradlew testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2 --no-daemon'
                    } finally {
                        junit testResults: '**/generated/test-reports/testOSGi/TEST-*.xml', skipPublishingChecks: true, allowEmptyResults: true
                    }
                }
            }
        }


        stage('Main branch release') {
            when { 
                branch 'main' 
            }
            steps {
               script {
                    echo "I am building on ${env.BRANCH_NAME}"                          
                    sh "./gradlew release -Drelease.dir=$JENKINS_HOME/repo.gecko/release/avatar-dataspace --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                }
            }
        }
        stage('Snapshot branch release') {
            when { 
                branch 'snapshot'
            }
            steps  {
                script {
                    echo "I am building on ${env.JOB_NAME}"
                    sh "./gradlew release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                    sh "mkdir -p $JENKINS_HOME/repo.gecko/snapshot/avatar-dataspace"
                    sh "rm -rf $JENKINS_HOME/repo.gecko/snapshot/avatar-dataspace/*"
                    sh "cp -r cnf/release/* $JENKINS_HOME/repo.gecko/snapshot/avatar-dataspace"
                } 
            }
        }
        stage('Resolve Avatar HIMSA') {
            steps {
                echo "I am resolving app on branch: ${env.GIT_BRANCH}"
                sh "./gradlew :org.avatar.himsa.runtime:resolve.launch --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }
        }                                                                         

        stage('Avatar HIMSA Export') {
//            when {
//                branch 'main'
//            }
            steps {
                echo "I am exporting app on branch: ${env.GIT_BRANCH}"
                sh "./gradlew :org.avatar.himsa.runtime:export.launch --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }
        }
        stage('Prepare Docker') {
//            when {
//                branch 'main'
//            }
            steps  {
                echo "I am preparing docker: ${env.GIT_BRANCH}"
                sh "./gradlew prepareDocker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }

        }

    }
}
