/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author DIPA
 */
public class SecneApplication {
    
private double x,y;
    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EntryChart.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("UI1.fxml"));
        
        Scene scene = new Scene(root);
        //scene.setFill(Color.BLACK);
    
        root.setOnMousePressed(new EventHandler<MouseEvent> (){
            @Override
            public void handle(MouseEvent event){
                x = event.getSceneX();
                y = event.getSceneY();
            }
        });
        
        root.setOnMouseDragged(new EventHandler<MouseEvent> (){
            @Override
            public void handle(MouseEvent event){
                //stage.setX(event.getSceneX() - x);
                //stage.setY(event.getSceneY() - y);
                
            }
        });
        
        stage.setScene(scene);
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.initStyle(StageStyle.DECORATED);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

