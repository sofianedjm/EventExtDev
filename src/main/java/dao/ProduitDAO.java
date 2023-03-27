package dao;

import dto.ProduitDTO;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ApplicationScoped
public class ProduitDAO {

    Map<Integer, ProduitDTO> produitDTOMap = new HashMap<Integer, ProduitDTO>();

    public ProduitDTO createClient(ProduitDTO produit) {
        produitDTOMap.put(produit.getId_produit(), produit);
        System.out.println("Affichage du nouveau produit : " + produit.getId_produit() + produit.getNom_produit() + produit.getStock() + produit.getSeuilRupture());
        return produit;
    }

    public Integer getMaxIdProduit() {
        if (!produitDTOMap.isEmpty()) {
            Set<Integer> s = produitDTOMap.keySet();
            return (Collections.max(s));
        } else return 0;
    }

    public ProduitDTO getProduit(Integer id) {
        return produitDTOMap.get(id);
    }
}