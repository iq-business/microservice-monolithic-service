#!/bin/bash
echo "Starting API Monolith..."
java -jar ./target/dependency/jetty-runner.jar --port 8080 ./target/beverage-maker-monolith.war
