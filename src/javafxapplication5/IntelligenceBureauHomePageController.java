/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class IntelligenceBureauHomePageController implements Initializable {

    @FXML
    private VBox mainContent;
    @FXML
    private Button location;
    @FXML
    private Button feedback;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        {
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str = "";
        try {
            f = new File("Notice.bin");
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
         feedback.setText(str);
         
    }
        
        
        {
    File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str = "";
        try {
            f = new File("Location.bin");
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
         location.setText(str);
         
    }
        // TODO
    }    


    @FXML
    private void showAllAgentinfo(ActionEvent event) {
    }

    @FXML
    private void notice(ActionEvent event) throws IOException {
        
    }

    @FXML
    private void emergemcy(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("Notice.fxml"));
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
    private void back(ActionEvent event) {
        try {
            Parent fxmlDocument = FXMLLoader.load(getClass().getResource("IntelligenceBureauLogin.fxml"));
            Scene fxmlDocumentscene = new Scene(fxmlDocument);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(fxmlDocumentscene);
            window.show();
        } catch (IOException ex) {

        }
    }
    
}

