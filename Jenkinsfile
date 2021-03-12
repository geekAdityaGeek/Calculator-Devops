pipeline {

    environment {
        registry = "adi96saha/calculatordevops"
        registryCredential = 'dockerhub'
    }

    agent any

    stages {

        stage('MAVEN BUILD') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('DOCKER BUILD IMAGE') {
            steps {
                script {
                  dockerImage = docker.build(registry + ":$BUILD_NUMBER", '.')
                }
            }
        }

        stage('DOCKER PUBLISH IMAGE') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('ANSIBLE CONFIGURATION AND DEPLOYMENT') {
            steps {
                script{
                    extra_input = '-e "ansible_python_interpreter=/usr/bin/python3 imagename='+registry+' tagver=$BUILD_NUMBER"'
                    ansiblePlaybook becomeUser: null, disableHostKeyChecking: true, extras: extra_input, installation: 'Ansible', inventory: './src/main/resources/ansible/hostfile.ini', playbook: './src/main/resources/ansible/playbook.yml'
                }
            }
        }
    }
}
