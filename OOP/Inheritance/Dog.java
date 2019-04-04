package Inheritance;

//extends -- keyword used for inheritance
//Whenever we extend a class -- we need to call the default ctc of parent class to initialize it
//As Animals class don't have nay default constructor --
//So we need to make sure that we create a ctc for Dog class -- calls the ctc of other class
//

/*
    super keyword is used for -- calling the ctc of the class we are extending from
 */

public class Dog extends Animals {

    //Extra characteristics specific to DOG
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(String name, int brain, int body, int size, int weight) {
//        //calling the ctc of the class we are extending from here Animals
//        super(name, brain, body, size, weight);
//    }

    //We need to initialize the extra variables as well

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    //We can add new things specific to Dog in this class which is not generic in Animal Class
    //we can initialize the generic characteristics in the ctc
    //we can assign extra states and behaviours

    //we can override the methods of the parent class

    private void chew() {
        System.out.println("Dog.chew() called");

    }

    public void walk() {
        System.out.println("Dog.walk() is called");
        //it will execute super class move() method irrespective of presnce or absence of any overridden move()method in this class
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() is called");
        //this means if it finds move() in this class first it will execute that method
        //or else it will execute super class move() method
        //we should always use only method name without super keyword
        //in future if we override this method in this class it will call the overridden method
        move(15);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() is called");

    }

    //overriding syntax

    @Override
    public void eat() {
        System.out.println("OVERRIDDEN Dog.eat() is called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("OVERRIDDEN Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }
}
