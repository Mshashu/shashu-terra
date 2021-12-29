package paytm;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class shashuApplication extends Application<shashuConfiguration> {

    public static void main(final String[] args) throws Exception {
        new shashuApplication().run(args);
    }

    @Override
    public String getName() {
        return "shashu";
    }

    @Override
    public void initialize(final Bootstrap<shashuConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final shashuConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
