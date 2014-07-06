package sample;

/**
 * Created by pc thomas on 06/07/2014.
 */
public class Base {
    /*variable*/
    private int id;
    private String nom;
    private int nbtable;

    /*constructeur*/
    public Base(int id, String nom, int nbtable) {
        this.id = id;
        this.nom = nom;
        this.nbtable = nbtable;
    }

    /*getter & setter*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbtable() {
        return nbtable;
    }

    public void setNbtable(int nbtable) {
        this.nbtable = nbtable;
    }
}
