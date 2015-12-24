## Bitcoin Address Service Example

An excuse to play around with [Dropwizard](http://www.dropwizard.io/) and [Docker](https://www.docker.com/) among other things.

### Building

```
./gradlew clean build && docker build -t bitcoin_address_service:latest .
```

### Running

```
docker run -it --rm bitcoin_address_service:latest
```
