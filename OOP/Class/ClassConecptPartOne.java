package Class;

//Real world things that exists - called Objects
//Real world things that exists - have states and behaviours
//For Example Cockroach

//states -- Age,No of legs,sleeping or awake
//behaviour -- eating,drinking,fighting,carrying food

//Software Object -- are fundamental part of object oriented Programming
//states - STORE IN fields called variables
//behaviour --  exposed behaviour in the from of methods

//Class -- That's a template or blueprint to create an object
//Class -- is more powerful where user defined things can be done compared to variables which can
//do limited things

//

public class ClassConecptPartOne {
    public static void main(String[] args) {

        //Create an an object of Car Class -- so that we can start using the properties
        //here Car is treated as a data type
        //Here we have created object of Car named porsche

        Car porsche = new Car();//we need to initialise to use the Car reference
        Car tata = new Car();

        //Before
        //As string is a class and the value is not assigned so it showed null

        System.out.println("The Model is "+porsche.getModel());
        //After Setting

        porsche.setModel("Carrera");
        System.out.println("The Model is "+porsche.getModel());

        tata.setModel("HaRRier");
        System.out.println("The Model is "+tata.getModel());

        tata.setModel("NEXON");
        System.out.println("The Model is "+tata.getModel().toLowerCase());
    }

}
