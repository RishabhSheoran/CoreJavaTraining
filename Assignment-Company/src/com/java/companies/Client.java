package com.java.companies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTMLDocument;

/**
 * Created by rishabhsheoran on 1/31/17.
 */
public class Client {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        //List<Department> departments;

        Company company1 = Company.createInstance(1,"AppDirect");

        Department department1 = Department.createDepartment(1, "IT");

        Department department2 = Department.createDepartment(2,"HR");

        Department department3 = Department.createDepartment(3,"QA");
        company1.addDepartment(department1);
        company1.addDepartment(department2);
        company1.addDepartment(department3);
        //company1.Departments.add(department2);
        //companies.add(company1);
        Project project1 = Project.createProject(1,"ShoppingCart");
        Project project2 = Project.createProject(2,"Stacks");
        Project project3 = Project.createProject(3,"Queues");
        department1.addProjects(project1);
        department1.addProjects(project2);
        department1.addProjects(project3);

        Project project4 = Project.createProject(1,"Forms");
        department2.addProjects(project4);

        Project project5 = Project.createProject(1,"Testing");
        department3.addProjects(project5);

        Employee emp1 = Employee.createEmployee(1,"Rishabh",21);
        Employee emp2 = Employee.createEmployee(2,"Bilal",24);
        project1.addEmployee(emp1);
        project1.addEmployee(emp2);

        Employee emp3 = Employee.createEmployee(3,"Natesh",25);
        project2.addEmployee(emp3);

        Employee emp4 = Employee.createEmployee(4,"Rawjyot",24);
        project3.addEmployee(emp4);

        project4.addEmployee(emp1);
        project5.addEmployee(emp1);

        Address homeAddress1 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress1 = Address.createAddress("MC","Pune","Maharashtra");
        emp1.addAddress(homeAddress1);
        emp1.addAddress(officeAddress1);

        Address homeAddress2 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress2 = Address.createAddress("MC","Pune","Maharashtra");
        emp2.addAddress(homeAddress2);
        emp2.addAddress(officeAddress2);

        Address homeAddress3 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress3 = Address.createAddress("MC","Pune","Maharashtra");
        emp3.addAddress(homeAddress3);
        emp3.addAddress(officeAddress3);

        Address homeAddress4 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress4 = Address.createAddress("MC","Pune","Maharashtra");
        emp4.addAddress(homeAddress4);
        emp4.addAddress(officeAddress4);

        companies.add(company1);

        Company company2 = Company.createInstance(2,"Amdocs");
        Department department4 = Department.createDepartment(1, "IT");

        Department department5 = Department.createDepartment(2,"HR");

        Department department6 = Department.createDepartment(3,"QA");
        company2.addDepartment(department4);
        company2.addDepartment(department5);
        company2.addDepartment(department6);
        //company1.Departments.add(department2);
        //companies.add(company1);

        Project project6 = Project.createProject(1,"Shop");
        Project project7 = Project.createProject(2,"Stacks implement");
        Project project8 = Project.createProject(3,"Queues implement");
        department4.addProjects(project6);
        department4.addProjects(project7);
        department4.addProjects(project8);

        Project project9 = Project.createProject(1,"Forms fill");
        department5.addProjects(project4);

        Project project10 = Project.createProject(1,"Testing unit");
        department6.addProjects(project5);

        Employee emp5 = Employee.createEmployee(1,"Rishi",21);
        Employee emp6 = Employee.createEmployee(2,"Billa",24);
        project6.addEmployee(emp5);
        project6.addEmployee(emp6);

        Employee emp7 = Employee.createEmployee(3,"Nitesh",25);
        project7.addEmployee(emp7);

        Employee emp8 = Employee.createEmployee(4,"Raw",24);
        project8.addEmployee(emp8);


        Address homeAddress5 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress5 = Address.createAddress("MC","Pune","Maharashtra");
        emp5.addAddress(homeAddress5);
        emp5.addAddress(officeAddress5);

        Address homeAddress6 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress6 = Address.createAddress("MC","Pune","Maharashtra");
        emp6.addAddress(homeAddress6);
        emp6.addAddress(officeAddress6);

        Address homeAddress7 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress7 = Address.createAddress("MC","Pune","Maharashtra");
        emp7.addAddress(homeAddress7);
        emp7.addAddress(officeAddress7);

        Address homeAddress8 = Address.createAddress("KP","Pune","Maharashtra");
        Address officeAddress8 = Address.createAddress("MC","Pune","Maharashtra");
        emp8.addAddress(homeAddress8);
        emp8.addAddress(officeAddress8);
        companies.add(company2);


        for (Company comp:companies
                ) {
            System.out.println("Company:  "+comp.getId() + " " + comp.getName());
            List<Department> depts = comp.getDepartments();

            for (int i = 0; i < depts.size() ; i++) {
                System.out.println("    Department:  " +depts.get(i).getId()+" "+depts.get(i).getName() );
                int j=0;
                Department dept = depts.get(i);
                List<Project> prjs = dept.getProjects();

                while(j<prjs.size()) {
                    Project proj = prjs.get(j);
                    System.out.println("        Project:  " + proj.getId() + " " + proj.getName());

                    List<Employee> empls = proj.getEmployees();
                    Iterator<Employee> itr = empls.iterator();
                    while(itr.hasNext()){
                        Employee emp =itr.next();
                        int k=0;
                        Address addr = emp.getAddresses().get(k);
                        System.out.println("            Employee:  "+emp.getId()+" "+ emp.getName()+" "+emp.getAge());
                        System.out.println("                HomeAddress:"+addr.getStreet()+", "+addr.getCity()+", "+addr.getState());
                        k++;
                        addr = emp.getAddresses().get(k);
                        System.out.println("                OfficeAddress:"+addr.getStreet()+", "+addr.getCity()+", "+addr.getState());


                    }

                    j++;
                }




            }
        }

    }
}
