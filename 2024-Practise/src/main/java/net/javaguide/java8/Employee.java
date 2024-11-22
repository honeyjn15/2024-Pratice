package net.javaguide.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

class EmployerFilter {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        employee.add((new Employee(1,"honey")));
        employee.add((new Employee(2,"Abhishek")));
        employee.add((new Employee(6,"Jain")));
        employee.add((new Employee(8,"Singhal")));
        employee.add((new Employee(3,"Gurgaon")));
/*
        List<String> filteredName = employee.stream().filter(
                emps ->emps.getId()>5 && emps.getName().startsWith("S")).map(
                        Employee ::getName).toList();
        System.out.println(filteredName);*/


        List<String> filteredName = employee.stream().filter(
                emps ->emps.getId()>5 )
                .filter(employee1 -> employee1.getName().startsWith("S"))
                .map(
                Employee ::getName).toList();
        System.out.println(filteredName);
    }

}
