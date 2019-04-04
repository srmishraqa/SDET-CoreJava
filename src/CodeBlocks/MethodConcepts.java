package CodeBlocks;

public class MethodConcepts {

	public static void main(String[] args) {

		calculateScore(true, 800, 5, 100);

		calculateScore(true, 10000, 8, 200);

	}

	// crate code once and put it in a block and use it time and time again
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver == true) {
			int finalScore = score + (bonus * levelCompleted);
			finalScore += 1000;
			System.out.println("The New Final Score is : " + finalScore);
		}

	}
}
