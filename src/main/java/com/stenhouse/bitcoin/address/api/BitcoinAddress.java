package com.stenhouse.bitcoin.address.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.subgraph.orchid.encoders.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.bitcoinj.core.Address;
import org.bitcoinj.params.MainNetParams;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Random;

/**
 * Created by jason on 12/24/15.
 */
public class BitcoinAddress {

    @NotEmpty
    private String address;

    public BitcoinAddress() {
        // Jackson deserialization
    }

    public BitcoinAddress(final String value) {
        this.address = new Address(MainNetParams.get(), Hex.decode(value)).toString();
    }

    @JsonProperty
    public String getAddress() {
        return address;
    }


    public static BitcoinAddress nextRandom() {
        // should be RIPEMD160 but we'll cheat a little
        final String randomSHA40 = nextRandomSHA40();

        return new BitcoinAddress(randomSHA40);
    }

    private static String nextRandomSHA40() {
        final String sha = DigestUtils.sha256Hex(nextRandomBytes());

        return sha.substring(0, 40);
    }

    private static byte[] nextRandomBytes() {
        byte[] bytes = new byte[50];
        new Random().nextBytes(bytes);
        return bytes;
    }
}
