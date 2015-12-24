package com.stenhouse.bitcoin.address.resources;

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
    public BitcoinAddress getAddress() {
        return BitcoinAddress.nextRandom();
    }
}
