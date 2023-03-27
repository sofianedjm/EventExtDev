package service;

import dao.ClientDAO;
import dto.ClientDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MessagerieServiceImpl implements MessagerieService {

    @Inject
    ClientDAO clientDAO;


    @Override
    public ClientDTO createClientScheduler() {
        return new ClientDTO(511515,"Djemaa","Sofiane","dfjnfsd");
    }
}