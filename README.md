# kotlin_gradle

This repository is for studying [Kotlin](https://kotlinlang.org/) and [Gradle](https://gradle.org/).

## Requirements

* `Kotlin 1.4.0+`
* `Gradle 6.6.1+`
* `JDK8`

## Getting Started

### Build

```bash
$ gradle build
```

### Test

```bash
$ gradle test
```

### Run single `JAR`

* Create single `JAR` by using [Gradle Shadow](https://github.com/johnrengelman/shadow).

```bash
$ gradle shadowJar
```

* Run single `JAR`

```bash
$ java -jar  build/libs/kotlin_gradle-1.0-SNAPSHOT-all.jar
```
