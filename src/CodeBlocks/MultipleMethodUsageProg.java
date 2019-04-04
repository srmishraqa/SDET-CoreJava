package CodeBlocks;

public class MultipleMethodUsageProg {

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;

        } else {
            return 4;
        }

    }

    public static void displayHighScorePosition(String name,int rank){

        System.out.println(name + " managed to get into the position number "+ rank +" on the high score table");

    }


    public static void main(String[] args) {

        displayHighScorePosition("Jeffry Archer" ,calculateHighScorePosition(1500));
        displayHighScorePosition("Andrew Tye" ,calculateHighScorePosition(900));
        displayHighScorePosition("David Warner" ,calculateHighScorePosition(400));
        displayHighScorePosition("Princess Diana" ,calculateHighScorePosition(50));

    }

}
