package camel;

import dto.ClientDTO;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import service.MessagerieService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;

@ApplicationScoped
public class ClientGateway {

    @Inject
    CamelContext camelContext;

    @Inject
    MessagerieService messagerieService;

    public void createNewClient(ClientDTO clientDTO) {
        try (ProducerTemplate producerTemplate = camelContext.createProducerTemplate()) {
            producerTemplate.sendBody("direct:newClient", clientDTO);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}