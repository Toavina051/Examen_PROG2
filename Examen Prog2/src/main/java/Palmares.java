public class Palmares {
    private int victoire;
    private int egalite;
    private int defaite;

    public Palmares(int victoire, int egalite, int defaite) {
        this.victoire = victoire;
        this.egalite = egalite;
        this.defaite = defaite;
    }

    public Palmares() {
        this.victoire = 0;
        this.egalite = 0;
        this.defaite = 0;
    }

    public int getVictoire() {
        return victoire;
    }

    public int getEgalite() {
        return egalite;
    }

    public int getDefaite() {
        return defaite;
    }

    public void setVictoire() {
        victoire++;
    }

    public void setDefaite() {
        defaite++;
    }

    public void setEgalite() {
        egalite++;
    }

    @Override
    public String toString() {
        return "Palmares{" +
                "victoire=" + victoire +
                ", egalite=" + egalite +
                ", defaite=" + defaite +
                '}';
    }
}
