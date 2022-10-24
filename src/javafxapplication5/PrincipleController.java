/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class PrincipleController implements Initializable {

    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label notificationLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void emailTextFieldOnMouseClick(MouseEvent event) {
    }


    @FXML
    private void signUpButton(ActionEvent event) {
    }

    @FXML
    private void passwordFieldOnMouseClick(MouseEvent event) {
    }

    @FXML
    private void forgotPasswordLabelOnMouseClicked(MouseEvent event) {
    }

    @FXML
    private void previousSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void submitButton(ActionEvent event) {
    }
    
}
