package dao;

import dto.CommandeReapproDTO;
import dto.ProduitDTO;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommandeReapproDAO {

    Map<Integer, CommandeReapproDTO> reapprosDTOmap = new HashMap<Integer, CommandeReapproDTO>();

    public void ArriveeReappro(CommandeReapproDTO e) {
        e.setEtat("terminate");
        ProduitDTO p = e.getProduit();
        p.setStock(p.getStock() + e.getQte());
    }

    public CommandeReapproDTO getCommandeReappro(Integer id) {
        return reapprosDTOmap.get(id);
    }

    public Integer getMaxIdReappro() {
        if (!reapprosDTOmap.isEmpty()) {
            Set<Integer> s = reapprosDTOmap.keySet();
            return (Collections.max(s));
        } else return 0;
    }
}