package sample;

import java.util.ArrayList;

/**
 * Created by pc thomas on 06/07/2014.
 */
public class Table {
    /*variable*/
    private int id;
    private int nbchamps;
    private int nblignedonnees;
    private String nom;
    private static ArrayList<Champ> lesChamps = new ArrayList<Champ>();   //Contient la liste des objets Champ
    private static ArrayList<LigneDonnees> listDonnees = new ArrayList<LigneDonnees>();   //Contient la liste des objets ligneDonnee

    /*constructeur*/
    public Table(int id, int nbchamps, int nblignedonnees, String nom) {
        this.id = id;
        this.nbchamps = nbchamps;
        this.nblignedonnees = nblignedonnees;
        this.nom = nom;
    }

    /*Getter & Setter*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbchamps() {
        return nbchamps;
    }

    public void setNbchamps(int nbchamps) {
        this.nbchamps = nbchamps;
    }

    public int getNblignedonnees() {
        return nblignedonnees;
    }

    public void setNblignedonnees(int nblignedonnees) {
        this.nblignedonnees = nblignedonnees;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static ArrayList<Champ> getLesChamps() {
        return lesChamps;
    }

    public static void setLesChamps(ArrayList<Champ> lesChamps) {
        Table.lesChamps = lesChamps;
    }

    public static ArrayList<LigneDonnees> getListDonnes() {
        return listDonnees;
    }

    public static void setListDonnes(ArrayList<LigneDonnees> listDonnes) {
        listDonnees = listDonnes;
    }

    /* Fonctions */
    public static void ajouterChamp(Champ c){
        lesChamps.add(c);
    }

    public static void ajouterLigneDonnees(LigneDonnees l){
        listDonnees.add(l);
    }

}