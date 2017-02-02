package com.java.companies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishabhsheoran on 1/31/17.
 */
public class Project {
    int id;
    String name;
    List<Employee> Employees;
    public Project(){
        Employees = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> employees) {
        Employees = employees;
    }
    public void addEmployee(Employee emp){
        Employees.add(emp);
    }
    public static Project createProject(int id, String name){
        Project project =new Project();
        project.setId(id);
        project.setName(name);
        return project;
    }
}
