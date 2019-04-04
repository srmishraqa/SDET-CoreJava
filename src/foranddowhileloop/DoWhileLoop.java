package foranddowhileloop;

//Same as while loop with lil difference
//advantage - it will be executed at least once if not more times depending on the test expression

public class DoWhileLoop {
    public static void main(String[] args) {

        int count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
        }
        while (count != 6);

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;

            if (count > 100) {
                break;
            }
        }
        while (count != 6);
    }
}
