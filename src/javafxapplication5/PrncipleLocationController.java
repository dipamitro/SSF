/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class PrncipleLocationController implements Initializable {

    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("Location.bin");
            fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);

            dos.writeUTF( textArea.getText());

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
    }
    
}
