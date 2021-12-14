FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu

RUN apt-get update && apt-get -y upgrade
RUN apt-get install -y inotify-tools dos2unix

ENV HOME=/app
RUN mkdir -p $HOME
WORKDIR $HOME

COPY . .

RUN ./mvnw clean install