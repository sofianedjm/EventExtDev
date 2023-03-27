package dao;

import dto.ClientDTO;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class ClientDAO {

    Map<Integer, ClientDTO> clientDTOMap = new HashMap<Integer, ClientDTO>();

    public ClientDTO createClient(ClientDTO client) {
        clientDTOMap.put(client.getId_client(), client);
        System.out.println("Affichage du nouveau client : " + client.getId_client() + client.getNom() + client.getPrenom());
        return client;
    }
}