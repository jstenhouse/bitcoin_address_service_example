package com.stenhouse.bitcoin.address;

import com.stenhouse.bitcoin.address.resources.BitcoinAddressResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by jason on 12/24/15.
 */
public class BitcoinAddressApplication extends Application<BitcoinAddressConfiguration> {

    public static void main(String[] args) throws Exception {
        new BitcoinAddressApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<BitcoinAddressConfiguration> bootstrap) {

    }

    @Override
    public void run(final BitcoinAddressConfiguration configuration, final Environment environment) throws Exception {
        environment.jersey().register(new BitcoinAddressResource());
    }
}
