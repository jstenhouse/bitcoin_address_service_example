## Bitcoin Address Service Example

An excuse to play around with [Dropwizard](http://www.dropwizard.io/) and [Docker](https://www.docker.com/) among other things.

### Building

```
./gradlew clean build && docker build -t bitcoin_address_service:latest .
```

### Running

```
docker run --name bitcoin_address_service -d -p 8080:8080 -p 8081:8081 bitcoin_address_service:latest
```

### Testing

```
docker-machine ip local

http://<ip-address>:8080/bitcoin/addresses
```

### Troubleshooting

```
docker run -it --rm --name bitcoin_address_service -p 8080:8080 -p 8081:8081 bitcoin_address_service:latest /bin/bash

/data/bitcoin_address_service_example/bin/bitcoin_address_service_example server
```

### See Also

Used with graphite in [bitcoin-address-playground](https://github.com/jstenhouse/docker_examples/tree/master/bitcoin-address-playground).
