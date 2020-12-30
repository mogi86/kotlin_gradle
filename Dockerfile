FROM openjdk:15

COPY . /usr/src/app
WORKDIR /usr/src/app

RUN ./gradlew build
RUN ./gradlew shadowJar

CMD ["java", "-jar", "build/libs/kotlin_gradle-1.0-SNAPSHOT-all.jar"]
