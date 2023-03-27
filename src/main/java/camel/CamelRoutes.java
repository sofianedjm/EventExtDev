package camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CamelRoutes extends RouteBuilder {

    @Inject
    CamelContext camelContext;

    @Inject
    ClientGateway clientGateway;


    @Override
    public void configure() throws Exception {
        camelContext.setTracing(true);

        from("direct:newClient")
                .log("nouveau client - ${body}")
                .bean(clientGateway, "createNewClient")
                .to("jms:queue:NouveauClient");

    }
}
