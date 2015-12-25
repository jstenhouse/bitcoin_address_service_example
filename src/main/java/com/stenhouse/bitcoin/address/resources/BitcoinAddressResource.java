package com.stenhouse.bitcoin.address.resources;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import com.stenhouse.bitcoin.address.api.BitcoinAddress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jason on 12/24/15.
 */
@Path("/bitcoin/addresses")
@Produces(MediaType.APPLICATION_JSON)
public class BitcoinAddressResource {

    @GET
    @Timed
    @Metered
    @ExceptionMetered
    public BitcoinAddress getAddress() {
        return BitcoinAddress.nextRandom();
    }
}
