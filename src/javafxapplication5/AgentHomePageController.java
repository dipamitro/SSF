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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class AgentHomePageController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> dayColumn;
    @FXML
    private TableColumn<?, ?> timeColumn;
    @FXML
    private TextArea emargencyTextArea;
    @FXML
    private MenuBar menuBar;
    @FXML
    private MenuItem replyLeaveApplicationMenuItem;
    @FXML
    private TextArea showTextArea;

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
        showTextArea.setText(str);
    }    

    @FXML
    private void loadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("Notice.bin");
            fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);

            dos.writeUTF( emargencyTextArea.getText());

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
    private void emergencyReplyMessageMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void inboxMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void replyLeaveApplicationMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void noticeFromAdminMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void noticeMenuOnClick(ActionEvent event) {
    }

    @FXML
    private void sendLeaveApplicationMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void sendMessageToAnyStaffMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void sendMessageMenuOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void privious(ActionEvent event) {
    try {
            Parent fxmlDocument = FXMLLoader.load(getClass().getResource("EntryComboBox.fxml"));
            Scene fxmlDocumentscene = new Scene(fxmlDocument);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(fxmlDocumentscene);
            window.show();
        } catch (IOException ex) {

        }}
    
    
}
