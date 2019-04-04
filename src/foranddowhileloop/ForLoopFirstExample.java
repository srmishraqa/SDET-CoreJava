package foranddowhileloop;

//for loop used to loop some code for certain no of times - more than once
//basic syntax
//for(init -- where to start ; termination -- when to evaluate false ; increment -- after each iteration how you want to go){
//this init variable only exists with in the loop and once the loop execution done
//it can't be reused and ready for Garbage Collector
// Then the operation you want to perform for each iteration
// }

public class ForLoopFirstExample {

    public static double calcInterest(double cap, double intRate) {
        double interest = (cap * (intRate / 100));
        return interest;
    }

    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.println("The interest calculated at the rate " + i + " % is " + String.format("%.2f", calcInterest(10000.00, (double) i)));
        }

        for (double i = 10; i <= 13; i = (i + 0.25)) {
            System.out.println("The interest calculated at the rate " + i + " % is " + String.format("%.2f", calcInterest(10000.00, i)));
        }
    }
}
