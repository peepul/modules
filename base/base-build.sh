#!/usr/bin/env bash

echo "开始 构建打包 jar 包"
mvn  clean -f pom.xml
mvn package -f pom.xml
