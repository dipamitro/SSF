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
public class Schdule {
    private String name;
    private String id;
    private String schedule;
    private String lcation;

    public Schdule(String name, String id, String schudle, String lcation) {
        this.name = name;
        this.id = id;
        this.schedule = schudle;
        this.lcation = lcation;
    }

    public Schdule() {
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

    public String getSchudle() {
        return schedule;
    }

    public void setSchudle(String schudle) {
        this.schedule = schudle;
    }

    public String getLcation() {
        return lcation;
    }

    public void setLcation(String lcation) {
        this.lcation = lcation;
    }

    @Override
    public String toString() {
        return "Schdule{" + "name=" + name + ", id=" + id + ", schudle=" + schedule + ", lcation=" + lcation + '}';
    }
    
    
}
