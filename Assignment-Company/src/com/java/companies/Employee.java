package com.java.companies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishabhsheoran on 1/31/17.
 */
public class Employee {
    int id;
    String name;
    private int age;
    List<Address> addresses;

    public Employee(int id, String name1, int age) {
        this.id = id;
        name = name1;
        this.age = age;
    }
    public Employee(){
        addresses = new ArrayList<>();
    };

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }

    }
    public void addAddress(Address address){
        this.addresses.add(address);
    }
    public static Employee createEmployee(int id, String name, int age){
        Employee emp = new Employee();
        emp.id=id;
        emp.name=name;
        emp.setAge(age);
        return emp;
    }
}
