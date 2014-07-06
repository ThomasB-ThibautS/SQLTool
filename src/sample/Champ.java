package sample;

import java.util.ArrayList;

/**
 * Created by pc thomas on 06/07/2014.
 */
public class Champ {
    private int id;
    private Table table;
    private boolean auto_inc;
    private boolean primaire;
    private boolean etrangere;
    private Champ champet;
    private String type;
    private int longueur;
    private boolean vide;
    private static ArrayList<Champ> lesChamps = new ArrayList<Champ>();   //Contient la liste des objets Champ

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isAuto_inc() {
        return auto_inc;
    }

    public void setAuto_inc(boolean auto_inc) {
        this.auto_inc = auto_inc;
    }

    public boolean isPrimaire() {
        return primaire;
    }

    public void setPrimaire(boolean primaire) {
        this.primaire = primaire;
    }

    public boolean isEtrangere() {
        return etrangere;
    }

    public void setEtrangere(boolean etrangere) {
        this.etrangere = etrangere;
    }

    public Champ getChampet() {
        return champet;
    }

    public void setChampet(Champ champet) {
        this.champet = champet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public boolean isVide() {
        return vide;
    }

    public void setVide(boolean vide) {
        this.vide = vide;
    }

    public static ArrayList<Champ> getLesChamps() {
        return lesChamps;
    }

    public static void setLesChamps(ArrayList<Champ> lesChamps) {
        Champ.lesChamps = lesChamps;
    }
}
