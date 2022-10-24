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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class EntryComboBoxxController implements Initializable {
    @FXML
    private ComboBox<String> comboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Admin","Agent","Principle","Control Room","Intelligence Bureau");
        comboBox.setValue("Admin");
        // TODO
    }  
    @FXML
    private void saveButton(ActionEvent event) throws IOException {
        if(comboBox.getValue().toString().equals("Admin"))
        {
            Parent adminLogin = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene adminLoginscene = new Scene(adminLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(adminLoginscene);
            window.show();
        }
        else if(comboBox.getValue().toString().equals("Agent"))
        {
            Parent agentLogin = FXMLLoader.load(getClass().getResource("Agent.fxml"));
            Scene agentLoginscene = new Scene(agentLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
          
            window.setScene(agentLoginscene);
            window.show();
        }
        else if(comboBox.getValue().equals("Control Room"))
        {
            Parent controlRoomLogin = FXMLLoader.load(getClass().getResource("ControlRoomLogin.fxml"));
            Scene controlRoomLoginscene = new Scene(controlRoomLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(controlRoomLoginscene);
            window.show();
        }
        else if(comboBox.getValue().equals("Principle"))
        {
            Parent principleLogin = FXMLLoader.load(getClass().getResource("PrincipleLogin.fxml"));
            Scene principleLoginscene = new Scene(principleLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      
            window.setScene(principleLoginscene);
            window.show();  
        }
        else if(comboBox.getValue().equals("Intelligence Bureau"))
        {
          Parent intelligenceBureauLogin = FXMLLoader.load(getClass().getResource("IntelligenceBureauLogin.fxml"));
            Scene intelligenceBureauLoginscene = new Scene(intelligenceBureauLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      
            window.setScene(intelligenceBureauLoginscene);
            window.show(); 
        }
    }

    @FXML
    private void comboBoxIsUpdate(ActionEvent event) {
    }
    
}
