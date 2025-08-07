import java.util.ArrayList;
import java.util.List;

public class Combattants {
    private final String id;
    private final String nom;
    private final String prenom;
    private final String nomCombattant;
    private Palmares palmares;
    private final Float poid;
    private List<String> titre;

    public Combattants(String id, String nom, String prenom, String nomCombattant, Float poid, Palmares palmares, List<String> titre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poid = poid;
        this.palmares = palmares;
        this.titre = titre;
    }

    public Combattants(String id, String nom, String prenom, String nomCombattant, Float poid, Palmares palmares) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.palmares = palmares;
        this.poid = poid;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }

    public Palmares getPalmares() {
        return palmares;
    }

    public Float getPoid() {
        return poid;
    }

    public List<String> getTitre() {
        return titre;
    }

    public void setTitre() {
        titre.add("");
    }
    @Override
    public String toString() {
        return "Combattants{" +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomCombattant='" + nomCombattant + '\'' +
                ", palmares=" + palmares +
                ", poid=" + poid +
                ", titre=" + titre +
                '}';
    }
}
