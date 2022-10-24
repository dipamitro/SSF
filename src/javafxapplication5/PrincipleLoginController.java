/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author DIPA
 */
public class PrincipleLoginController implements Initializable {
    
    private Button button;
    private TextField textUsername;
    private PasswordField textPassword;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label notificationLabel;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void emailTextFieldOnMouseClick(MouseEvent event) {
        //notificationLabel.setText("");
    }

    @FXML
    private void submitButton(ActionEvent event) throws IOException {
//       File f = null;
//        FileInputStream fis = null;      
//        ObjectInputStream ois = null;
//        int d=1;
//        String n = "";
//        String e = "";
//        String m = "";
//        String p = "";
//        String g ="";
//        try {
//            f = new File("PrincipleInfo.bin");
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//            Principle c;
//            try{
//                
//                //while(true){
//                    
//                    c = (Principle)ois.readObject();
//                    //if(c.getEmail()==emailTextField.getText() && c.getPassword()==passwordField.getText())
//                    //{
//                    d=2; 
//                    n = c.getName();
//                    e = c.getEmail();
//                    m = c.getMobileNo();
//                    p = c.getPassword();
//                    g = c.getGender();
//                    System.out.println(n+e+m+p+g);
//                    //}
//                    
//                //}
//            }
//            catch (ClassNotFoundException ex) {    
//               Logger.getLogger(PrincipleLoginController.class.getName()).log(Level.SEVERE, null, ex);
//           }    
//            } catch (IOException ex) { } 
//        finally {
//            try {
//                if(ois != null) ois.close();
//            } catch (IOException ex) { }
//        }
       
        emailTextField.clear();
        passwordField.clear();
        //if(d==2)
        //{
            FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("PrincipleHomePage.fxml"));
                Parent principleHomePageParent = loader.load();
                Scene principleHomePageScene = new Scene(principleHomePageParent);
                
                PrincipleHomePageController controller = loader.getController();
                controller.initData(new Principle("Dipa",emailTextField.getText(),"019",passwordField.getText(),"F"));
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.setScene(principleHomePageScene);
                window.show();
        
        //else{
        //    notificationLabel.setText("Invalid Id or Password,Try Again!!!");
        //}
        
        
    }

    private Principle submit() {
        Principle c = Principle.login(emailTextField.getText(),passwordField.getText());
        
        if(c==null)
           return null;       
       else{
           return c;
       }
    }
    

    @FXML
    private void signUpButton(ActionEvent event) throws IOException {
        Parent principleSignUp = FXMLLoader.load(getClass().getResource("PrincipleSign.fxml"));
            Scene principleSignUpscene = new Scene(principleSignUp);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(principleSignUpscene);
            window.show();
    }

    @FXML
    private void passwordFieldOnMouseClick(MouseEvent event) {
         notificationLabel.setText("");
    }

    @FXML
    private void forgotPasswordLabelOnMouseClicked(MouseEvent event) {
        try {
            Parent forgotPassword = FXMLLoader.load(getClass().getResource("ForgotPassword.fxml"));
            Scene forgotPasswordscene = new Scene(forgotPassword);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(forgotPasswordscene);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(PrincipleLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void previousSceneButtonOnClick(ActionEvent event) {
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
