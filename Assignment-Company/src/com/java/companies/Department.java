package com.java.companies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishabhsheoran on 1/31/17.
 */
public class Department {
    int id;
    String name;
    List<Project> projects;
    public Department(){
        projects = new ArrayList<Project>();
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        projects = projects;
    }
    public void addProjects(Project project){
        projects.add(project);
    }
    public static Department createDepartment(int id, String name){
        Department dep = new Department();
        dep.setId(id);
        dep.setName(name);
        return dep;
    }

}
