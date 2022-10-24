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
import java.util.ArrayList;

/**
 *
 * @author DIPA
 */
public class Agent {
    private String name;
    private String id;
    private String salary;
    private String phone;

    public Agent(String name, String id, String salary, String phone) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phone = phone;
    }

    public Agent() {
    }

    Agent(String readUTF, String readUTF0, String readUTF1, String readUTF2, String readUTF3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   

    @Override
    public String toString() {
        return "Agent{" + "name=" + name + ", id=" + id + ", salary=" + salary + ", phone=" + phone + '}';
    }
public String showReplyOfLeaveApplication() {
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str = "";
        try {
            f = new File("ReplyLeaveApplication.bin");
            if (!f.exists()) {

            } else {

                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);

                while (true) {
                    String id = dis.readUTF();
                    String message = dis.readUTF();
                    

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

    

    
    }
    
    
    
