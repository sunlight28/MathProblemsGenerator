FROM openjdk:22-jdk-slim AS build

WORKDIR /app

COPY pom.xml .

RUN apt-get update && apt-get install -y maven \
    && mvn dependency:resolve -B

COPY mvnw .
COPY .mvn .mvn
COPY src src

RUN mvn clean package -DskipTests -B

FROM openjdk:22-jdk-slim

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]