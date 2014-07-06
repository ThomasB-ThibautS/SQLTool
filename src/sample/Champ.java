package sample;

import java.util.ArrayList;

/**
 * Created by pc thomas on 06/07/2014.
 */
public class Champ {
    private int id;
    private boolean auto_inc;
    private boolean primaire;
    private boolean etrangere;
    private String type;
    private static ArrayList<Champ> lesChamps = new ArrayList<Champ>();   //Contient la liste des objets Champ

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<Champ> getLesChamps() {
        return lesChamps;
    }

    public static void setLesChamps(ArrayList<Champ> lesChamps) {
        Champ.lesChamps = lesChamps;
    }
}
