def call(String ComposeFile = "docker-compose.yml") {
    sh """
        # Start containers using docker-compose
        docker compose -f ${ComposeFile} up -d

        # Clean up unused Docker resources
        docker system prune -af
    """
    
    echo "Deployment completed and Docker system cleaned up."
}
