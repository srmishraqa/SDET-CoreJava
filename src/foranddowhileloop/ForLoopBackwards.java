package foranddowhileloop;

public class ForLoopBackwards {
    public static void main(String[] args) {
        for (int i = 9; i >= 2; i--) {
            System.out.println("The interest calculated at the rate " + i + " % is " + String.format("%.2f", ForLoopFirstExample.calcInterest(10000.00, (double) i)));
        }
    }


}