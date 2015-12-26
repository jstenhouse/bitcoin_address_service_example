package com.stenhouse.bitcoin.address;

import com.codahale.metrics.health.HealthCheck;
import com.stenhouse.bitcoin.address.resources.BitcoinAddressResource;
import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
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
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );
    }

    @Override
    public void run(final BitcoinAddressConfiguration configuration, final Environment environment) throws Exception {

        environment.healthChecks().register("always_healthy", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy();
            }
        });

        environment.jersey().register(new BitcoinAddressResource());
    }
}
