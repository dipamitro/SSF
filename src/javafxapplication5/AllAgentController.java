/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import static javax.management.Query.value;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class AllAgentController implements Initializable {

    @FXML
    private TableView<Agent> agentTable;
    @FXML
    private TableColumn<Agent,String> nameColl;
    @FXML
    private TableColumn<Agent,String> idColl;
    @FXML
    private TableColumn<Agent,String> salaryColl;
    @FXML
    private TableColumn<Agent,String> phoneColl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColl.setCellValueFactory(new PropertyValueFactory<Agent,String>("name"));
        idColl.setCellValueFactory(new PropertyValueFactory<Agent,String>("id"));
        salaryColl.setCellValueFactory(new PropertyValueFactory<Agent,String>("salary"));
        phoneColl.setCellValueFactory(new PropertyValueFactory<Agent,String>("phone"));
        ObservableList<Agent> value;
        // TODO
        agentTable.setItems(AddAgentLayoutController.agtList);
    }    
    
}
