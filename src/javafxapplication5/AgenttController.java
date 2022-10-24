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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class AgenttController implements Initializable {

    @FXML
    private TableView<?> typeTV;
    @FXML
    private TableColumn<?, ?> agentId;
    @FXML
    private TableView<?> agentTV;
    @FXML
    private TextArea resultTextArea;
    @FXML
    private Button button;
    @FXML
    private Label resultLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showbutton(ActionEvent event) {
    }
    
}
