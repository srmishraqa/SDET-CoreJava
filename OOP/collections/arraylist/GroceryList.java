package collections.arraylist;

import java.util.ArrayList;

public class GroceryList {

    //We are creating an array list with <String> type - <> defines the type of the element array list contains
    //ArrayList is a class and we have created Object of that cLass
    //Here we did not define any number which will act as a length

    private ArrayList<String> groceryList = new ArrayList<String>();

    //fn
    public void addGroceryItem(String item) {
        //to add an new item we can use add()
        groceryList.add(item);
    }

    public void printArrayList() {
        //size() returns the length of the ArrayList
        System.out.println("You Have " + groceryList.size() + " items in your Grocery List");
        for (int i = 0; i < groceryList.size(); i++) {
            //We use get() method for fetching
            System.out.println("The element at " + i + " index is " + groceryList.get(i));
        }

    }

    //Replace an existing item or update an exiting an item
    //we can use set(int,String) method
    //It will replace the exiting item with the String parameter in the int position
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item at " + position + " index been replaced by " + newItem);
    }

    //remove an existing item -- we can use remove(int)
    //it will remove that index based item from the array list
    public void removeItem(int position) {
        String theitem = groceryList.get(position);
        groceryList.remove(position);
        //after removing an item the index gets updated automatically

    }

    public String findItem(String SerachItem){
        //contains returns boolean in ArrayList
        //boolean flag = groceryList.contains(SerachItem);
        //We can use indexOf() function to find an index of an item
        int index = groceryList.indexOf(SerachItem);
        //returns -1 if it does not find an item
        if(index >= 0){
            return groceryList.get(index);
        }
        else{
            return null;
        }
    }
}
