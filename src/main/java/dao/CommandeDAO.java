package dao;

import dto.ClientDTO;
import dto.CommandeDTO;
import dto.ProduitDTO;
import exceptions.StockInsuffisantException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ApplicationScoped
public class CommandeDAO {

    @Inject
    ProduitDAO produitDAO;

    Map<Integer, CommandeDTO> commandeMap = new HashMap<Integer, CommandeDTO>();

    public Integer getMaxIdCommande() {
        if (!commandeMap.isEmpty()) {
            Set<Integer> s = commandeMap.keySet();
            return (Collections.max(s));
        } else return 0;
    }

    public void ArriveeCommande(ProduitDTO p, Integer qte, ClientDTO cl, String datecom) throws StockInsuffisantException {
        if (p.getStock() > qte) {
            Integer id = getMaxIdCommande();
            CommandeDTO com = new CommandeDTO(id + 1, cl, p, qte, datecom, "en_cours");
            commandeMap.put(id, com);
            p.setStock(p.getStock() - qte);
        } else throw new StockInsuffisantException();
    }

    public void createCommande(CommandeDTO commande) {
        commandeMap.put(commande.getId_commande(), commande);
        System.out.println("Arrive d'une nouvelle commande le : " + commande.getDateCom() + " type de produit :" + commande.getProduit().getNom_produit() + " par :" + commande.getClient().getPrenom());
    }
}