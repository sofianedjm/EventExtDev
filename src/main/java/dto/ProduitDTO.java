package dto;

public class ProduitDTO {

    private Integer stock;
    private Integer id_produit;
    private Integer seuilRupture;
    private String nom_produit;


    public ProduitDTO (Integer qte, Integer id, Integer seuil,String n ) {
        super();
        stock=qte;
        id_produit=id;
        seuilRupture=seuil;
        nom_produit=n;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        Integer oldValue=this.stock;
        this.stock = stock;
    }

    public Integer getId_produit() {
        return id_produit;
    }

    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }

    public Integer getSeuilRupture() {
        return seuilRupture;
    }

    public void setSeuilRupture(Integer seuilRupture) {
        Integer oldValue=this.seuilRupture;
        this.seuilRupture = seuilRupture;

    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String toString() {
        return (" Nom :" + nom_produit +" IdProduit :" + id_produit +" stock :" + stock + " seuil :" +seuilRupture);
    }

}
