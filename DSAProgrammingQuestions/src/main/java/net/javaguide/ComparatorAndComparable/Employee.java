package net.javaguide.ComparatorAndComparable;


import java.util.ArrayList;
import java.util.Comparator;

class EmployeePojo {

    public String name;
    public int id;
    public int salary;

    public EmployeePojo(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class Employee {
    public static void main(String[] args) {
        ArrayList<EmployeePojo> employeePojoLst = new ArrayList<>();
        employeePojoLst.add(new EmployeePojo("Honey", 1, 200000));
        employeePojoLst.add(new EmployeePojo("Roshni", 2, 150000));
        employeePojoLst.add(new EmployeePojo("Saurabh", 3, 130000));
        employeePojoLst.add(new EmployeePojo("Kritika", 4, 140000));

        //comparator will be used here when we want to sort
     /*   Comparator<EmployeePojo> name = Comparator.comparing(EmployeePojo::getName);
        employeePojoLst.sort(name);
        for (EmployeePojo emp : employeePojoLst) {
            System.out.println(emp);
        }
        System.out.println("===========================================================");*/
        //But if want to apply some condition
        employeePojoLst.stream().filter(e -> e.getName().equals("Honey")).forEach(e -> System.out.println(e));

        System.out.println("===========================================================");
        //Comparator with two attribute
       // Comparator<EmployeePojo> sortMultipleObject = Comparator.comparing(EmployeePojo::getName).thenComparingInt(EmployeePojo::getSalary);
        employeePojoLst.sort(Comparator.comparing(EmployeePojo::getName).thenComparingInt(EmployeePojo::getSalary));
        for (EmployeePojo employeePojo : employeePojoLst) {
            System.out.println(employeePojo);
        }
        System.out.println("===========================================================");
        //Reverse the order of sorting
        employeePojoLst.sort(Comparator.comparing(EmployeePojo::getId).reversed());
        for (EmployeePojo employeePojo : employeePojoLst) {
            System.out.println(employeePojo);
        }

    }
}


