package Inheritance;

/*
Concepts:
Although Objects of an class can share similar characteristics
They can be different from each other as well -- with different characteristics as well

SO OOP allows us to create classes -- to inherit commonly shared states and behaviours from other classes

we use extends keyword to Inherit a class
Class B extends A
means A is the parent class and B is the Child Class

 */

public class InheritanceConcept {

    public static void main(String[] args) {


        Animals animal = new Animals("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        System.out.println("-----------------------------");
        dog.walk();
        System.out.println("-----------------------------");
        dog.run();
        System.out.println("-----------------------------");

    }


}
