pipeline {

    environment {
        registry = "adi96saha/calculatordevops"
        registryCredential = 'dockerhub'
    }

    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', credentialsId: '2594fe28-1c4f-4745-9bd2-279f91acc938', url: 'https://github.com/geekAdityaGeek/Calculator-Devops'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('docker build image') {
            steps {
                script {
                  dockerImage = docker.build(registry + ":$BUILD_NUMBER", '.')
                }
            }
        }

        stage('docker publish image') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('ansible configuration') {
            steps {
                script{
                    extra_input = '-e "ansible_python_interpreter=/usr/bin/python3 imagename='+registry+' tagver=$BUILD_NUMBER"'
                    ansiblePlaybook becomeUser: null, disableHostKeyChecking: true, extras: extra_input, installation: 'Ansible', inventory: './src/main/resources/ansible/hostfile.ini', playbook: './src/main/resources/ansible/playbook.yml'
                }
            }
        }
    }
}
