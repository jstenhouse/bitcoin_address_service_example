FROM java:8

ADD build/distributions/bitcoin_address_service_example.tar /data

CMD ["/bin/bash"]
