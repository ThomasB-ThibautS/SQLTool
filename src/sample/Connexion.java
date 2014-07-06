package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Thibaut on 03/07/2014.
 */
public class Connexion {
    public static String bd = "";
    public static Connection con;
    public static boolean connexionReussie = true;

    public static Connection getConnection(String login, String mdp, String url, String bd, String port){ // Connexion à la base de données
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            System.out.println("url = " +url);
            System.out.println("jdbc:mysql://" + url + ":" + port + "/" + bd);
            connection = DriverManager.getConnection("jdbc:mysql://" + url + ":" + port + "/" + bd, login, mdp);
            if (url != null){
                connexionReussie = true;
            }else {
                connexionReussie = false;
            }
        } catch (SQLException e) {
            System.out.println("Erreur mot de passe");
            e.printStackTrace();
            connexionReussie = false;     // On dit que la connexion n'as pas réussie
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return connection;
    }
    public static boolean connexion(String login, String mdp, String url, String bd, String port) {  //Lancement de la connexion avec les champs renseignés dans connexion.fxml
        if(port.equals("")){
            port = "3306";
        }
        con = Connexion.getConnection(login, mdp, url, bd, port);
        return connexionReussie;
    }
    public static boolean connexion(String login, String mdp, String url, String port) {  //Lancement de la connexion avec les champs renseignés dans connexion.fxml
        if(port.equals("")){
            port = "3306";
        }
        con = Connexion.getConnection(login, mdp, url, bd, port);
        return connexionReussie;
    }


    public static Connection getCon() { //On recupère la connexion
        return con;
    }

    public static void setBd(String bdnew) {   // On recupère le nom de la BD
        bd = bdnew;
    }
}
