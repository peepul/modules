FROM openjdk:8-jre
MAINTAINER peepul peepvl@126.com

RUN ["sh", "./base-build.sh"]

COPY target/base-1.0-SNAPSHOT.jar /usr/local/modules/base/base-service.jar

ENTRYPOINT ["java", "-jar","/usr/local/modules/base/base-service.jar" ]