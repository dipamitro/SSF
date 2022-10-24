/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class ForgotPasswordController implements Initializable {

    @FXML
    private TextField textField;
    @FXML
    private Label notificationLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void textFieldOnMouseClick(MouseEvent event) {
        notificationLabel.setText("");
    }

    @FXML
    private void snedButtonOnClick(ActionEvent event) {
        boolean b = Principle.actionForForgotPassword(textField.getText());
        if (b == true) {
            notificationLabel.setText("An otp is send to the email");
        } else {
            notificationLabel.setText("Please Give a valid email address");
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent customerLogin = FXMLLoader.load(getClass().getResource("PrincipleLogin.fxml"));
            Scene customerLoginscene = new Scene(customerLogin);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(customerLoginscene);
            window.show();
        } catch (IOException ex) {

        }
    }

}
