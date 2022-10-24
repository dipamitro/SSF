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
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AdminHomePageController implements Initializable {

    @FXML
    private VBox mainContent;
    @FXML
    private Button chart;
    @FXML
    private Button emergengy;
    @FXML
    private Button feedback;
    @FXML
    private Button leave;
    @FXML
    private Button location;

    /**
     * Initializes the controller class.
     */
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent pane=FXMLLoader.load(getClass().getResource("AddAgentLayout.fxml"));
             mainContent.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(AdminHomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        
    } 
    
   

    @FXML
    private void addAgent(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("AddAgentLayout.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void showAllAgentinfo(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("AllAgent.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void notice(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("Notice.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void emergemcy(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("EmergencyAdminMassage.fxml"));
             mainContent.getChildren().setAll(pane);
        
        
    }

    @FXML
    private void addAgentSecdule(ActionEvent event) throws IOException {
       
               Parent pane = FXMLLoader.load(getClass().getResource("AddAgentSchedule.fxml"));
             mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void leaveApplication(ActionEvent event) {
    }

    @FXML
    private void chartdtails(ActionEvent event) throws IOException {
        /*Parent pane = FXMLLoader.load(getClass().getResource("EntryChart.fxml"));
             mainContent.getChildren().setAll(pane);*/
             try {
            Parent adminLogin = FXMLLoader.load(getClass().getResource("EntryChartt.fxml"));
            Scene adminLoginscene = new Scene(adminLogin);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(adminLoginscene);
            window.show();
        } catch (IOException ex) {
           
        }
    
}


    @FXML
    private void previousSceneButtonOnClick(ActionEvent event) {
         try {
            Parent fxmlDocument = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene fxmlDocumentscene = new Scene(fxmlDocument);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(fxmlDocumentscene);
            window.show();
        } catch (IOException ex) {

        }
    }

    @FXML
    private void previousSceneButtonOnClickk(ActionEvent event) {
    }
}
