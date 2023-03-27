package dao;

import dto.CommandDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CommandeDAO {

    @Inject
    ProduitDAO produitDAO;

    Map<Integer, CommandDTO> commandeMap = new HashMap<Integer, CommandDTO>();

    public void createCommande(CommandDTO commande){
        commandeMap.put(commande.getId_commande(), commande);
        System.out.println("Arrive d'une nouvelle commande le : " + commande.getDateCom() + " type de produit :"+ commande.getProduit().getNom_produit() + " par :" + commande.getClient().getPrenom());
    }
}