package com.ravleen.Lecture_51;
class Employee {
    String name;
    int id;
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", ID: " + id + ", Department: " + department;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Ravleen", 101, "Computer Science");
        System.out.println(emp);
    }
}