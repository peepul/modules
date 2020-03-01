#!/usr/bin/env bash

echo  "构建整个Modules项目，并运行Docker 容器 ... ... "

sudo docker build -f ./base/Dockerfile -t modules-base:v1.0 .



