package com.ravleen.Lecture_52;
class Person {
    private String address;
    public String name;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void printAddress() {
        System.out.println("Address: " + address);
    }
}
public class printAddress {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", "Delhi");
        System.out.println("Name: " + p1.name);
        p1.printAddress();
    }
}
