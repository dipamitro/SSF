/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class EmergencyAdminMassageController implements Initializable {

    
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextArea messageTextArea;
    
    private ArrayList<String> arr = new ArrayList<>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    

    @FXML
    private void sendButtonOnClick(ActionEvent event) throws IOException {
       File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("Notice.bin");
            fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);

            dos.writeUTF( messageTextArea.getText());

        } catch (IOException ex) {
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            File file = new File("AdminInfo.txt");
            Scanner sc;
            String str = null;
            sc = new Scanner(file);
            
            while (sc.hasNextLine()) {
                str = sc.nextLine();
               
                
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("AdminHomePage.fxml"));
                Parent adminHomepageParent = loader.load();
                Scene adminHomepageScene = new Scene(adminHomepageParent);
                
                AdminHomePageController controller = loader.getController();
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(adminHomepageScene);
                window.show();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmergencyAdminMassageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmergencyAdminMassageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void replyEmergencyMessage(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
