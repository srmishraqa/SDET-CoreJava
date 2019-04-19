package collections.arraylist;

import java.util.Scanner;

/*
Resizing of an Array is difficult and time taking and mostly size is fixed
to overcome this issue we can use List/ArrayList

List -- sequence of numbers -- ordered collection -- Interface
ArrayList class implements List Interface
List Interface extends -- Collection Interface

ArrayList -- resizable -- handles resizing part automatically and internally
Once element gets added to array list the resizing happens automatically


 */
public class ArrayListConcepts {

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("cheese");
        groceryList.addGroceryItem("Ghee");
        groceryList.addGroceryItem("oil");

        groceryList.printArrayList();
        System.out.println("*****************************************");

        groceryList.removeItem(2);
        groceryList.printArrayList();
        System.out.println("*****************************************");

        groceryList.modifyGroceryItem(2,"Butter");
        groceryList.printArrayList();
        System.out.println("*****************************************");

        String var = groceryList.findItem("cheese");
        System.out.println(var);



    }

}
