/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class AddAgentScheduleController implements Initializable {

    @FXML
    private TextField agentName;
    @FXML
    private TextField agentid;
   
    @FXML
    private TextField agentLocation;
    @FXML
    private TextField agentSchedule;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    static ObservableList<Agent> agtList=FXCollections.observableArrayList(); 
    @FXML
    private void saveButton(ActionEvent event) throws IOException {
        String name =agentName.getText();
        String id =agentid.getText();
        String schedule =agentSchedule.getText();
        String location =agentLocation.getText();
        if (name.equals("")&& id.equals("")&&schedule.equals("")& location.equals(""))return;
        Agent agt=new Agent(name,id,schedule,location);
        File file=new File("schedule.txt");
        if(!file.exists())file.createNewFile();
        FileWriter fileWriter;
        fileWriter = new FileWriter(file,true);
        fileWriter.write(name+"#"+id+"#"+schedule+"#"+location+"\n");
        fileWriter.close();
        
       agtList.add(agt); 
       
       agentid.clear();
       agentSchedule.clear();
       agentLocation.clear();
       
    }

    @FXML
    private void resetButton(ActionEvent event) {
    }
    
}