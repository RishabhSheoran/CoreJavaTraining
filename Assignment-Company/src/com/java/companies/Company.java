package com.java.companies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishabhsheoran on 1/31/17.
 */
public class Company {

        int id;
        String name;
        List<Department> Departments;
        public Company(){
            Departments=new ArrayList<>();
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

        public List<Department> getDepartments() {
            return Departments;
        }

        private void setDepartments(List<Department> departments) {
            Departments = departments;
        }

        public void addDepartment(Department department){
            Departments.add(department);
        }

        public static Company createInstance(int id, String name){
            Company company = new Company();
            company.setId(id);
            company.setName(name);
            return company;
        }
}
