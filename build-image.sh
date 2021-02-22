#!/bin/bash

# Build with Gradle.
./gradlew installDist

# Package in a Docker image.
docker build -t markdown-party-backend .
