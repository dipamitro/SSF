/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class PrincipleHomePageController implements Initializable {

    @FXML
    private VBox mainContent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void notice(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("PrncipleLocation.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void emergemcy(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("EmergencyAdminMassage.fxml"));
             mainContent.getChildren().setAll(pane);
    }


    void initData(Principle principle) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void feedback(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("EmergencyAdminMassage.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void sendLocation(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("PrncipleLocation.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void sendTime(ActionEvent event) {
    }

    @FXML
    private void replyEmergency(ActionEvent event) {
    }

    @FXML
    private void other(ActionEvent event) {
    }

    @FXML
    private void priveous(ActionEvent event) {
        try {
            Parent fxmlDocument = FXMLLoader.load(getClass().getResource("EntryComboBox.fxml"));
            Scene fxmlDocumentscene = new Scene(fxmlDocument);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(fxmlDocumentscene);
            window.show();
        } catch (IOException ex) {

        }
    }
    
}
