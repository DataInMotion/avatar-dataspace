pipeline  {
    agent any

    environment {
        JAVA_OPTS = "-Xms4048m -Xmx4048m -XX:MaxMetaspaceSize=2048m -Dgosh.args=--nointeractive ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
        VERSION = "${env.BUILD_ID}"
    }


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
        stage('Resolve and Export') {
            steps {
                echo "I am resolving exporting app on branch: ${env.GIT_BRANCH}"
                sh "./gradlew :org.avatar.himsa.runtime:resolve.launch --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew :org.avatar.other.runtime:resolve.launch --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew :org.avatar.himsa.runtime:export.launch --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew :org.avatar.other.runtime:export.launch --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
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
        stage('Docker Image build'){
//            when {
//                branch 'main'
//            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/himsa',
                            cloud: 'docker',
                            tagsString: """devel.data-in-motion.biz:6000/scj/avatar-himsa:latest
                                        devel.data-in-motion.biz:6000/scj/avatar-himsa:0.1.0.${VERSION}""",
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])
                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/other',
                            cloud: 'docker',
                            tagsString: """devel.data-in-motion.biz:6000/scj/avatar-other:latest
                                        devel.data-in-motion.biz:6000/scj/avatar-other:0.1.0.${VERSION}""",
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])
            }
        }
    }
}
