package foranddowhileloop;

//instead of certain no of times running a statement
// we want to run all our statements until it is false and we don't know how many times we need to loop
//In that case we use while statement
//SYNTAX
// create a counter outside the loop
//then  the condition
//then the statements we want to execute
//and then the increment or decrement operator

//In while loop -- the control may not enter even inside the loop if the condition or comparison does not satisfy first time
//Even if we don't increment or decrement we may end up in an infinity loop


public class WhileLoop {

    public static void main(String[] args) {
        //1st way
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //2nd way
        //set infinity loop and the breaking condition under an if block
        count = 0;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
    }

}
