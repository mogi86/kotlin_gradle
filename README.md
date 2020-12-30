# kotlin_gradle

This repository is for studying [Kotlin](https://kotlinlang.org/) and [Gradle](https://gradle.org/).

## Requirements

* `Kotlin 1.4.21+`
* `Gradle 6.6.1+`
* `JDK15`

## Getting Started

### Build

```bash
$ make build
```

### Test

```bash
$ make test
```

### Run single `JAR`

* Create single `JAR` by using [Gradle Shadow](https://github.com/johnrengelman/shadow).

```bash
$ make shadowJar
```

* Run single `JAR`

```bash
$ make run
```

### Run on docker container

```bash
$ docker build -t my-kotlin-app .
$ docker run -it --rm --name my-running-app my-kotlin-app
```
