/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
//import model.Person;

/**
 *
 * @author chinm
 */
public class PersonHistory {
    
    private ArrayList<Person> history;
    
    public PersonHistory(){
        
        this.history = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonHistory() {
        return history;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.history = history;
    }
    
    public Person addNewPersonVitals(){
        Person newPersonVitals = new Person();
        history.add(newPersonVitals);
        return newPersonVitals;
    }
    
    public void deletePersonVitals(Person vs){
        history.remove(vs);
    }
    
     
    
}
