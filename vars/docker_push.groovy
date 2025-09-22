def call(String Project, String ImageTag) {
    withCredentials([usernamePassword(credentialsId: 'dockerhub-cred',
                                      passwordVariable: 'dockerHubPass',
                                      usernameVariable: 'dockerHubUser')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
    }
}

