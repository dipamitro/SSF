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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author DIPA
 */
public class loginController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField textPassword;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==button){
           String username=textUsername.getText();
           String password=textPassword.getText();
           if(username.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("dipa")){
              
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));

                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();}
           else{
               System.out.println("Usernamr /password combination not found. ");
           }
        } 
    }
    
       

    @FXML
    private void previousSceneButtonOnClick(ActionEvent event) {
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
