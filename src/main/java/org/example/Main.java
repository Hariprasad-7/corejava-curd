package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {

    List<Employee> employeeList = new ArrayList<>();
    public Employee saveEmploye(){
        Employee employee= new Employee();
        Employee emp= new Employee();
        employee.setName("Hari");
        employee.setId(UUID.randomUUID().toString());
        employee.setCountry("INDIA");
        emp.setName("prasad");
        emp.setId(UUID.randomUUID().toString());
        emp.setCountry("USA");
        employeeList.add(employee);
        employeeList.add(emp);
        return employee;

    }

    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    public Employee getEmployeById(String name){
        Employee employee = employeeList.stream().filter(e->e.getName().equalsIgnoreCase(name)).findAny().get();
        //log file
        return employee;

    }

    public String deleteById(String id){
        Employee employee = employeeList.stream().filter(e->e.getCountry().equalsIgnoreCase(id)).findFirst().get();
        employeeList.remove(employee);
        return "employe deleted with id"+employee;

    }
    public static void main(String[] args) {
        Main main  = new Main();
        System.out.println("====save employe====");
        System.out.println( main.saveEmploye());
        System.out.println("==========getAllEmployees===================");
        System.out.println();
        System.out.println(main.getAllEmployees());
        System.out.println("=========getEmployeBydId============");
        System.out.println();
        System.out.println(main.getEmployeById("prasad"));
        System.out.println("==========deleteById==========");
        System.out.println();
        System.out.println();
        System.out.println(main.deleteById("USA"));
        System.out.println("============getAllEmployees====");
        System.out.println();
        System.out.println();
        System.out.println(main.getAllEmployees());


    }
}