package com.ravleen.Lecture_52;
 class jee {
    private String make;
    public int year;
    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }
}
public class PrivateSnippet {
    public static void main(String[] args) {
        jee myCar = new jee();
        myCar.year = 2024;
        System.out.println("Car Year: " + myCar.year);
        myCar.setMake("Honda");
        System.out.println("Car Make: " + myCar.getMake());
    }
}
