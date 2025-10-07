package com.ravleen.Lecture_52;
class Car{
    public String make;
    public  int year;
}
public class CreateObject {
    public static void main(String[] args) {
     Car myCar = new Car();
     myCar.make = "Honda";
     myCar.year = 2015;
        System.out.println(myCar.make);
        System.out.println(myCar.year);

    }
}
