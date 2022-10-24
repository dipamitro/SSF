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
public class ControlRoomHomePageController implements Initializable {

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
    private void addAgent(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("PrincipleUpdate.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void showAllAgentinfo(ActionEvent event) {
    }

    @FXML
    private void notice(ActionEvent event) throws IOException {
        
    }

    @FXML
    private void emergemcy(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("EmergencyAdminMassage.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void addAgentSecdule(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("Notice.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void leaveApplication(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("Meet.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void schedule(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) {
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
