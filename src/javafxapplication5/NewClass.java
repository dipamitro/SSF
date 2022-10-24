/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

/**
 *
 * @author DIPA
 */
public class NewClass {
    private String name;
    private String id;
    private String salary;
    private String agentType;

    public NewClass(String name, String id, String salary, String agentType) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.agentType = agentType;
    }

    public NewClass() {
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

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }
    
    
}
