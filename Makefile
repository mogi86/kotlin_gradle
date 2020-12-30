.PHONY: build
build:
	./gradlew build

.PHONY: test
test:
	./gradlew test

.PHONY: shadowJar
shadowJar:
	./gradlew shadowJar

.PHONY: run
run:
	java -jar build/libs/kotlin_gradle-1.0-SNAPSHOT-all.jar