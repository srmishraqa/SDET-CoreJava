package Class;
/*
public - access modifier -- no restricted access
private - no other class can access the class
protected - classes of same package can access the class
default -
 */

/*
Here Car class is a blueprint
It has own variables with in the class - called global variables
global variables - can be accessed with in the class any where - also called member variables
Variables with in the method - only can be accessed with in the method
called local variables
 */

/*
Generally access modifiers for variables - are private
This is due to encapsulation - hiding the internal Implementation
Not allowing outside access
 */


public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

//    As private variables are not accessible by other classes we need to declare them as public
//
//    public int doors;
//    public int wheels;
//    public String model;
//    public String engine;
//    public String color;
//
//    creating method to set
//
    public void setModel(String model){

        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("nexon")) {
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }


        //here this key word calls the global variable in the class and assign the value of the parameter
        //update this model variable in the class with the model parameter passed in the method
    }

    public String getModel(){
        return this.model;
    }

}
