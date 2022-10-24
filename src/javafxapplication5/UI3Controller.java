/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class UI3Controller implements Initializable {

   
     @FXML private BarChart<String, Number> barChart;
    @FXML private NumberAxis yAxis;
    @FXML private CategoryAxis xAxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Farid",25));
        series.getData().add(new XYChart.Data<>("Shahed",150));
        series.getData().add(new XYChart.Data<>("Faria",160));
        series.getData().add(new XYChart.Data<>("Raihan",200));
        series.setName("Monthly Pay");
        barChart.getData().add(series);
    }    
}
