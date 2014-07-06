package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private static TextField tx_login;
    @FXML private static TextField tx_mdp;
    @FXML private static TextField tx_url;
    @FXML private static TextField tx_port;
    @FXML private static Label lb_message;
    @FXML private Button bt_valider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        bt_valider.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public  void handle(ActionEvent e) {
                boolean reussie = Connexion.connexion(tx_login.getText(), tx_mdp.getText(), tx_url.getText(), tx_port.getText());
                if (!reussie) {
                    tx_login.clear();
                    tx_mdp.clear();
                    tx_url.clear();
                    tx_port.clear();
                    lb_message.setText("Mot de passe ou Adresse incorrect");
                    lb_message.setTextFill(Color.rgb(210, 39, 30));
                }else{
                    /*URL location = getClass().getResource("sample.fxml");
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(location);
                    fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());

                    Parent root = null;
                    try {
                        root = (Parent) fxmlLoader.load(location.openStream());
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                    Base c =fxmlLoader.getController();
                    c.bdlist = Base.listeTable();       // On liste les noms de la base de données dans bdlist
                    c.setLesBd(c.bdlist);  //  On récupere la liste bdlist pour la mettre en observable
                    Stage popUp = new Stage();
                    popUp.initModality(Modality.WINDOW_MODAL);
                    popUp.initOwner(((Node)e.getSource()).getScene().getWindow());
                    popUp.setScene(new Scene(root, 600,400));
                    popUp.show();*/
                }
            }
        });
    }
}
