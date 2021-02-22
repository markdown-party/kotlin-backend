#!/bin/bash

docker tag markdown-party-backend ghcr.io/markdown-party/markdown-party-backend

# Log in to GitHub package registry.
echo $GPR_TOKEN | docker login ghcr.io -u $GPR_USERNAME --password-stdin

# Push the Docker images.
docker push ghcr.io/markdown-party/markdown-party-backend
