package dto;

public class RelanceDTO {

    private CommandeReapproDTO reappro;
    private String dateRelance;
    private String commentaire;
    private Integer id_relance;

    public RelanceDTO (Integer id,CommandeReapproDTO c, String d, String comment) {
        this.id_relance=id;
        this.reappro=c;
        this.dateRelance=d;
        this.commentaire=comment;
    }

    public CommandeReapproDTO getReappro() {
        return reappro;
    }

    public Integer getId_relance() {
        return id_relance;
    }

    public String getDateRelance() {
        return dateRelance;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String toString() {
        return (" reappro :" + reappro.getId_reappro() +" id_relance :" + id_relance +" date :" + dateRelance + " commentaire :" +commentaire);
    }

}
