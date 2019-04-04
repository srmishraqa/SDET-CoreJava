package foranddowhileloop;

public class DoWhileChallengeTwo {
    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int evenCount = 0;
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
            evenCount++;
            if (evenCount >= 5) {
                break;
            }

        }
        System.out.println("Total no. of even numbers found is : " + evenCount);
    }


}

