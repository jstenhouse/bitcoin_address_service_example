## Bitcoin Address Service Example

An excuse to play around with [Dropwizard](http://www.dropwizard.io/) and [Docker](https://www.docker.com/) among other things.

### Building

```
./gradlew clean build && docker build -t bitcoin_address_service:latest .
```

### Running

```
docker run -d -p 8080:8080 -p 8081:8081 bitcoin_address_service:latest
```

### Testing

```
docker-machine ip local

http://<ip-address>:8080/bitcoin/addresses
```

### Troubleshooting

```
docker run -it --rm -p 8080:8080 -p 8081:8081 bitcoin_address_service:latest /bin/bash
```
