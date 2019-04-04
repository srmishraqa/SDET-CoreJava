package CodeBlocks;

public class IfElseConceptTim {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your Score was in between 1000 & 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score is less than 1000");
//
//        } else {
//            System.out.println("Got here in else loop");
//        }

        if (gameOver == true) {
            int finalScore = score + (bonus * levelCompleted);
            //We can't use code block variables outside the block
            //java deletes these kind of variables as soon as we come out of the loop
            System.out.println("The Final Score is : " + finalScore);
        }

        //1st approach

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver == true) {
//            int finalScore = newScore + (newBonus * newLevelCompleted);
//            System.out.println("The new Final Score is : " + finalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("The New Final Score is : " + finalScore);
        }

    }


}


//Duplicating the code tends to have more errors

