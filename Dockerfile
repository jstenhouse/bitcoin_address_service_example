FROM java:8

ADD build/distributions/bitcoin_address_service_example.tar /data

EXPOSE 8080 8081

CMD ["/data/bitcoin_address_service_example/bin/bitcoin_address_service_example","server"]
