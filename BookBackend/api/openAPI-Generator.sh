#!/bin/bash
# generate the java api client from the openAPI.yaml file
openapi-generator-cli generate -i openAPI.yaml -g spring -o gen --config java-api-config.json

apiDestination="../src/main/java/de/die/openAPI"
if [ -d "$apiDestination" ]; then
    rm -rf "$apiDestination"
fi
mkdir -p "$apiDestination"

cp -r gen/src/main/java/de/die/openAPI/api/ "$apiDestination"
cp -r gen/src/main/java/de/die/openAPI/model/ "$apiDestination"