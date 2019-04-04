package foranddowhileloop;

public class DoWhileCahllengeOne {

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            //continue keyword will skip this block and again go back to while
            System.out.println("Even Number is : " + number);
            number++;

        }
    }
}
