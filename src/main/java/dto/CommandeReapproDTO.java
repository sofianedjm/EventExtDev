package dto;

public class CommandeReapproDTO {

    private Integer qte;
    private ProduitDTO produit;
    private String dateCommande;
    private String commentaire;
    private String etat;
    final private Integer id_reappro;

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public CommandeReapproDTO(Integer id_reappro, Integer qte, ProduitDTO p, String date, String c) {
        this.id_reappro=id_reappro;
        this.qte=qte;
        this.produit=p;
        this.dateCommande=date;
        this.commentaire=c;
        this.etat="créée";

    }

    public Integer getId_reappro() {
        return id_reappro;
    }


    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public ProduitDTO getProduit() {
        return produit;
    }

    public void setProduit(ProduitDTO produit) {
        this.produit = produit;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String toString() {
        return ("Id CommandeReappro :" + id_reappro +" Nom :" + produit.getNom_produit() +" qte :" + qte + " date :" +dateCommande +" commentaire :" +commentaire );
    }
}