public class Principessa {
    private String nome;
    private Drago carceriere;
    private String stato="libera";
    public Principessa(String nome, String stato) {
        this.nome = nome;
        this.stato = stato;
    }
    public Drago getCarceriere() {
        return carceriere;
    }
    public void setCarceriere(Drago carceriere) {
        this.carceriere = carceriere;
    }
    public String getStato(){
        return stato;
    }
    public void setStato(){
        this.stato=stato;
    }

}