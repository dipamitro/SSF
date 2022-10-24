/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPA
 */
public class PrincipleSignController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField mobileTextField;
    private final ArrayList<Principle> principleArr = new ArrayList<>();
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private RadioButton othersRadioButton;
    @FXML
    private TextField passwordTextField;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();

        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        othersRadioButton.setToggleGroup(tg);
        // TODO
    } 
//    private void addPrinciple() {
//        String gdr = "";
//        if (maleRadioButton.isSelected()) {
//            gdr = "Male";
//        } else if (femaleRadioButton.isSelected()) {
//            gdr = "Female";
//        } else {
//            gdr = "Others";
//        }
//
//        principleArr.add(
//                new Principle(nameTextField.getText(),
//                        emailTextField.getText(), mobileTextField.getText(),
//                        passwordTextField.getText(), gdr)
//        );
//    }
//    private void saveToTheFile() {
//
//        String gdr = "";
//        if (!nameTextField.getText().equals("") || !emailTextField.getText().equals("") || !mobileTextField.getText().equals("") || !passwordTextField.getText().equals("")) {
//            if (femaleRadioButton.isSelected() || maleRadioButton.isSelected()) {
//                if (emailTextField.getText().contains("@gmail.com")) {
//                    if (mobileTextField.getText().contains("01") && mobileTextField.getText().length() == 11) {
//                        if (maleRadioButton.isSelected()) {
//                            gdr = "Male";
//                        } else if (femaleRadioButton.isSelected()) {
//                            gdr = "Female";
//                        } else {
//                            gdr = "Others";
//                        }
//                        Principle.signUp(nameTextField.getText(),
//                                emailTextField.getText(), mobileTextField.getText(),
//                                passwordTextField.getText(), gdr);
//
//                        Alert a = new Alert(Alert.AlertType.INFORMATION);
//                        a.setTitle("Information Alert");
//                        a.setHeaderText("Thank you for signup");
//                        a.setContentText("SignUp successful");
//                        a.showAndWait();
//                    } else {
//                        Alert a = new Alert(Alert.AlertType.INFORMATION);
//                        a.setTitle("Information Alert");
//                        a.setHeaderText("Please giva e valid mobile no.");
//                        a.setContentText("SignUp not successful!!!");
//                        a.showAndWait();
//                    }
//                } else {
//                    Alert a = new Alert(Alert.AlertType.INFORMATION);
//                    a.setTitle("Information Alert");
//                    a.setHeaderText("Please giva e valid email id");
//                    a.setContentText("SignUp not successful!!!");
//                    a.showAndWait();
//                }
//            }
//
//        } else {
//            Alert a = new Alert(Alert.AlertType.INFORMATION);
//            a.setTitle("Information Alert");
//            a.setHeaderText("Please fillup all");
//            a.setContentText("SignUp not successful!!!");
//            a.showAndWait();
//        }
//    }
//
//    private void saveButtonOnClick(ActionEvent event) {
//        File f = null;
//        FileOutputStream fos = null;      
//        ObjectOutputStream oos = null;
//         String gdr = "";
//        if (maleRadioButton.isSelected()) {
//            gdr = "Male";
//        } else if (femaleRadioButton.isSelected()) {
//            gdr = "Female";
//        } else {
//            gdr = "Others";
//        }
//        try {
//            f = new File("PrincipleInfo.bin");
//            if(f.exists()){
//                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);                
//            }
//            else{
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream(fos);               
//            }
//            Principle c = new Principle(nameTextField.getText(),emailTextField.getText(), mobileTextField.getText(), passwordTextField.getText(), gdr);
//            
//            oos.writeObject(c);
//
//        } catch (IOException ex) {
//            } finally {
//            try {
//                if(oos != null) oos.close();
//            } catch (IOException ex) {
//                }
//        }       
//
//    }

    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
Parent principleLogin = FXMLLoader.load(getClass().getResource("PrincipleLogin.fxml"));
        Scene principleLoginscene = new Scene(principleLogin);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(principleLoginscene);
        window.show();
    }

    @FXML
    private void saveButtonOnClickk(ActionEvent event) {
        System.out.println("....");
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
         String gdr = "";
        if (maleRadioButton.isSelected()) {
            gdr = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gdr = "Female";
        } else {
            gdr = "Others";
        }
        try {
            f = new File("PrincipleInfo.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Principle c = new Principle(nameTextField.getText(),emailTextField.getText(), mobileTextField.getText(), passwordTextField.getText(), gdr);
            System.out.println("....");
            oos.writeObject(c);

        } catch (IOException ex) {
            System.out.println("....");
            } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("....");
                }
        }   
    }
    }
    
