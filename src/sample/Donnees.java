package sample;

/**
 * Created by pc thomas on 06/07/2014.
 */
public class Donnees {
    /*variables*/
    private int id;
    private String valeur;

    /*constructeur*/
    public Donnees(int id, String valeur) {
        this.id = id;
        this.valeur = valeur;
    }

    /*getter & setter*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
