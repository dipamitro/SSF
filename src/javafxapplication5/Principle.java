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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

/**
 *
 * @author DIPA
 */
public class Principle {
    protected String name;
    protected String email;
    protected String mobileNo;
    protected String password;
    protected String gender;

    public Principle(String name, String email, String mobileNo, String password, String gender) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    
//    public static void signUp(String n,String e,String m,String p,String g)
//    {
//        File f = null;
//        FileOutputStream fos = null;      
//        ObjectOutputStream oos = null;
//        
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
//            Principle c = new Principle(n, e, m, p, g);
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
//    }
    
    public static Principle login(String mail,String pass)
    {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("PrincipleInfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Principle c;
            try{
                
                while(true){
                    
                    c = (Principle)ois.readObject();
                    if(c.getEmail().equals(mail) && c.getPassword().equals(pass))
                    {
                        return c;
                    }
                }
            }
            catch(Exception e){
                
            }    
            } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return null;
    }
    
    public String showEmergencyMessage() {

        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str = "";
        try {
            f = new File("EmergencyMessage.bin");
            if (!f.exists()) {
            } else {

                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);

                while (true) {
                    str += dis.readUTF() + "," + dis.readUTF() + ": " + dis.readUTF();
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
        return str;
    }
    public void replyEmergencyMessage(String n, String i, String message) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("EmergencyMessageFromAdminToSecurity.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
            } else {
                fos = new FileOutputStream(f);
            }

            dos = new DataOutputStream(fos);

            dos.writeUTF(n);
            dos.writeUTF(i);
            dos.writeUTF(message);

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

    public void clearEmergencyMessage() {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        //try {
            f = new File("EmergencyMessage.bin");
            f.delete();
        /*File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("EmergencyMessage.bin");
            fos = new FileOutputStream(f);
            dos = new DataOutputStream(fos);

            dos.writeUTF("");

        } catch (IOException ex) {
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException ex) {
            }
        }*/
    }
    
    public ArrayList<Agent> showAgentInfo()
    {
        ArrayList<Agent> agentArr = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            f = new File("AgentInfo.bin");
            if (!f.exists()) {

            } else {

                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);

                while (true) {
                    Agent newAgent =  new Agent(dis.readUTF(), 
                            dis.readUTF(), dis.readUTF(),
                            dis.readUTF(), dis.readUTF());
                    agentArr.add(newAgent);
                }
            }
        } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException ex) {
                }
        }
        return agentArr;
    }
    
  
    
    public String seeAboutInfo()
    {
        
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("About.bin");
            if (!f.exists()) {

            } else {

                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);

                while (true) {
                    str = dis.readUTF();
                }
            }
        } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException ex) {
                }
        }
        return str;
    }
    
    public static boolean actionForForgotPassword(String m)
    {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("PrincipleInfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Principle c;
            try{
                
                while(true){
                    
                    c = (Principle)ois.readObject();
                    if(c.getEmail().equals(m))
                    {
                        return true;
                    }
                }
            }
            catch(Exception e){
                
            }    
            } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return false;
    }
    
    
}
