package dto;

public class RelanceReapproDTO {

    private final CommandeReapproDTO reappro;
    private final String dateRelance;
    private final String commentaire;
    private final Integer id_relance;

    public RelanceReapproDTO(Integer id, CommandeReapproDTO c, String d, String comment) {
        this.id_relance = id;
        this.reappro = c;
        this.dateRelance = d;
        this.commentaire = comment;
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
        return (" reappro :" + reappro.getId_reappro() + " id_relance :" + id_relance + " date :" + dateRelance + " commentaire :" + commentaire);
    }

}