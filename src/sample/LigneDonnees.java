package sample;

import java.util.ArrayList;

/**
 * Created by pc thomas on 06/07/2014.
 */
public class LigneDonnees {
    /*variable*/
    private int id;
    private static ArrayList<Donnee> lesDonnees = new ArrayList<Donnee>();   //Contient la liste des objets donnees

    /*constructeur*/

    public LigneDonnees(int id) {
        this.id = id;
    }

    /*getter & setter*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Donnee> getLesDonnees() {
        return lesDonnees;
    }

    public static void setLesDonnees(ArrayList<Donnee> lesDonnees) {
        LigneDonnees.lesDonnees = lesDonnees;
    }

    /*Fonctions */
    public static void ajouterDonnee(Donnee d){
        lesDonnees.add(d);
    }
}
