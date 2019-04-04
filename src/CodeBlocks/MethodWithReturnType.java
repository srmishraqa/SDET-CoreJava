package CodeBlocks;

public class MethodWithReturnType {

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver == true) {
			int finalScore = score + (bonus * levelCompleted);
			finalScore += 1000;
			return finalScore;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("The New Final Score is : " + highScore);

		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("The New Final Score is : " + highScore);
	}

}
