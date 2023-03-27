package dto;

public class CommandDTO {

    private Integer id_commande;
    private ClientDTO client;
    private ProduitDTO produit;
    private Integer qte;
    private String dateCom;
    private String etatCom;

    public CommandDTO (Integer id_commande, ClientDTO client, ProduitDTO produit, Integer qte, String dateCom, String etatCom){
        this.id_commande=id_commande;
        this.client=client;
        this.produit=produit;
        this.dateCom=dateCom;
        this.etatCom=etatCom;
        this.qte=qte;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public ProduitDTO getProduit() {
        return produit;
    }

    public void setProduit(ProduitDTO produit) {
        this.produit = produit;
    }

    public Integer getQte() {
        return qte;
    }

    public Integer getId_commande() {
        return id_commande;
    }

    public void setId_commande(Integer id_commande) {
        this.id_commande = id_commande;
    }
    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getDateCom() {
        return dateCom;
    }

    public void setDateCom(String dateCom) {
        this.dateCom = dateCom;
    }

    public String getEtatCom() {
        return etatCom;
    }

    public void setEtatCom(String etatCom) {
        this.etatCom = etatCom;
    }

}