FROM zenika/alpine-maven as build

WORKDIR /app/prova/spring-prova

COPY mvnw ./
COPY pom.xml .
COPY src src

RUN mvn install -DskipTests

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./target/erik-prova-0.1.0.jar"]

