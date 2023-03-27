package dao;

import dto.CommandeReapproDTO;
import dto.RelanceReapproDTO;

import javax.inject.Inject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class RelanceDAO extends TimerTask {

    @Inject
    CommandeReapproDTO commandeReapproDTO;

    Map<Integer, RelanceReapproDTO> relanceReapproDTOHashMap = new HashMap<Integer, RelanceReapproDTO>();

    public Integer getMaxIdRelance() {
        if (!relanceReapproDTOHashMap.isEmpty()) {
            Set<Integer> s = relanceReapproDTOHashMap.keySet();
            return (Collections.max(s));
        } else return 0;
    }

    public void addRelance(RelanceReapproDTO rpd) {
        relanceReapproDTOHashMap.put(rpd.getId_relance(), rpd);
    }

    public RelanceReapproDTO getRelance(Integer id) {
        return relanceReapproDTOHashMap.get(id);
    }

    @Override
    public void run() {
        System.out.println("exécution relance");
        System.out.println("etat" + commandeReapproDTO.getEtat());
        RelanceDAO nouvelleCommande = new RelanceDAO();
        if (!commandeReapproDTO.getEtat().equals("terminée")) {
            DateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
            String d = fd.format(Calendar.getInstance().getTime());
            RelanceReapproDTO r = new RelanceReapproDTO(nouvelleCommande.getMaxIdRelance() + 1, commandeReapproDTO, d, "généré automatiquement après 1h");
            nouvelleCommande.addRelance(r);
        }
    }
}