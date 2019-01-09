#! /bin/bash
version=$(grep -o '".*"' version.sbt | sed 's/"//g')
echo "Gerando versão: $version"
./sbt docker:stage && docker build --no-cache=true -f Dockerfile -t actor-server:$version .