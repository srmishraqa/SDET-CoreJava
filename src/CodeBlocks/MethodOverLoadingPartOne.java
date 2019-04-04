package CodeBlocks;

public class MethodOverLoadingPartOne {


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    //method overloading -- Using the same method name using different parameters
    //1.change the no. of parameters -- data type is very important
    // Method signature should be unique
    //Changing the return type with same argument type is not allowed - it is not method overloading
    //

    public static int calculateScore(int score) {
        System.out.println("Unknown Player" + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unknown Player" + "Unknown Score");
        return 0;
    }

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);

        calculateScore(750);

        calculateScore();


    }
}
