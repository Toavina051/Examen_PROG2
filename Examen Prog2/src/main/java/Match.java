public class Match {
    private final int id;
    private final String date;
    private final String address;
    private final TypesMatch match;
    private final Combattants combattants1;
    private final Combattants combattants2;
    private int frappe;
    private int score1;
    private int score2;

    public Match(int id, String date, String address, TypesMatch match, Combattants combattants1, Combattants combattants2) {
        this.id = id;
        this.date = date;
        this.address = address;
        this.match = match;
        this.combattants1 = combattants1;
        this.combattants2 = combattants2;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public TypesMatch getMatch() {
        return match;
    }

    public Combattants getCombattants1() {
        return combattants1;
    }

    public Combattants getCombattants2() {
        return combattants2;
    }

    public int getFrappe() {
        return frappe;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    void touche(int touche){
        if(combattants1.equals(frappe)){
            score1 += touche;
        }
        else if(combattants2.equals(frappe)){
            score2 += touche;
        }
    }

    void typeMatch (){
        if(match.equals(TypesMatch.amicaux)){
            getCombattants1().getPalmares();
            getCombattants2().getPalmares();
        }
        else if (match.equals(TypesMatch.titre)){
            if(score1 > score2){
                getCombattants1().getPalmares().setVictoire();
                getCombattants2().getPalmares().setDefaite();
                getCombattants1().getPalmares();
                getCombattants1().setTitre();
            }
            else if(score2 == score1){
                getCombattants1().getPalmares().setEgalite();
                getCombattants2().getPalmares().setEgalite();
            }
            else{
                getCombattants2().getPalmares().setVictoire();
                getCombattants1().getPalmares().setDefaite();
                getCombattants2().setTitre();
            }
        }
        else if(match.equals(TypesMatch.officiels)){
            if(score1 > score2){
                getCombattants1().getPalmares().setVictoire();
                getCombattants2().getPalmares().setDefaite();
                getCombattants1().getPalmares();
            }
            else if(score2 == score1){
                getCombattants1().getPalmares().setEgalite();
                getCombattants2().getPalmares().setEgalite();
            }
            else{
                getCombattants2().getPalmares().setVictoire();
                getCombattants1().getPalmares().setDefaite();
            }
        }
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                ", typesMatch=" + match +
                ", combattants1=" + combattants1 +
                ", combattants2=" + combattants2 +
                ", score Combattant1=" + score1 +
                ", score Combattant2=" + score2 +
                '}';
    }
}
