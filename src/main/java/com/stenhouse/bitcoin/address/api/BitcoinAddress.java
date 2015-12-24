package com.stenhouse.bitcoin.address.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by jason on 12/24/15.
 */
public class BitcoinAddress {

    // ex. 3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy

    @NotEmpty
    private String address;

    public BitcoinAddress() {
        // Jackson deserialization
    }

    public BitcoinAddress(final String address) {
        this.address = address;
    }

    @JsonProperty
    public String getAddress() {
        return address;
    }

    public static BitcoinAddress nextRandom() {
        return new BitcoinAddress("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy");
    }
}
