public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalscore = score;

        if (gameOver) {
            finalscore += levelCompleted*bonus;
            System.out.println("Your final score was : " + finalscore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            finalscore += levelCompleted*bonus;
            System.out.println("Your final score was : " + finalscore);
        }
    }
}
