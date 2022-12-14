/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class EmployeeStorage {
    
    private ArrayList<Employee> history;
    
    public EmployeeStorage(){
        
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }

    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee vs){
        history.remove(vs);
    }
}
