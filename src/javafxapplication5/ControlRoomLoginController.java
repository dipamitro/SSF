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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class ControlRoomLoginController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label notificationLabel;
    @FXML
    private Button button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void idTextFieldMouseClick(MouseEvent event) {
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        
        if(event.getSource()==button){
            String username=idTextField.getText();
            String password=passwordField.getText();
           if(username.equalsIgnoreCase("1234")&& password.equalsIgnoreCase("dipa")){
              
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("ControlRoomHomePage.fxml"));

                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();}
           else{
               System.out.println("Usernamr /password combination not found. ");
           }
        } 
    }

   

    @FXML
    private void forgotPasswordLabelOnMouseClicked(MouseEvent event) {
        notificationLabel.setText("Please contact with Admission Office");
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

    @FXML
    private void passwordFieldOnClick(MouseEvent event) {
    }
    
}
