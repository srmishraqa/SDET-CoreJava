package Inheritance;

//all class by default in java extends to Object Class of java.lang package

/*
Create a base class Vehicle and Create a Car class which extends Vehicle
Create a 3rd Class which is a specific type of Class inherits from Car Class
Hand Steering,Changing Gears,Moving speed -
 */


public class InheritanceChallengeOne {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.accelarate(30);
        outlander.accelarate(20);
    }

}
