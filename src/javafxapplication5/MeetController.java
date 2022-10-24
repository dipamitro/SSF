/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class MeetController implements Initializable {


    @FXML
    private TextArea textareaa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str = "";
        try {
            f = new File("Meet.bin");
            if (!f.exists()) {

            } else {

                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);

                while (true) {
                    str = dis.readUTF();

                }

            }
        } catch (IOException ex) {
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException ex) {
            }
        }
        textareaa.setText(str);
    }
        

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("Meet.bin");
            fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);

            dos.writeUTF( textareaa.getText());

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
            Parent fxmlDocument = FXMLLoader.load(getClass().getResource("EntryComboBox.fxml"));
            Scene fxmlDocumentscene = new Scene(fxmlDocument);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(fxmlDocumentscene);
            window.show();
        } catch (IOException ex) {

        }
    }
    }
    

