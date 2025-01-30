import java.util.Random;

public class Method {
    static Random rand = new Random();

    public static void main(String[] args) {
        displayHighScorePosition("Sanyi", calculateHighScorePosition(1500));
        displayHighScorePosition("Anyád", calculateHighScorePosition(1000));
        displayHighScorePosition("Árpi", calculateHighScorePosition(500));
        displayHighScorePosition("Csabi", calculateHighScorePosition(100));
        displayHighScorePosition("Kati", calculateHighScorePosition(25));

        for (int i = 0; i < 25; i++) {
            String[] name = new String[10]; // Correctly initialize the array with size 10
            for (int j = 0; j < 10; j++) {
                // Fill the array with random lowercase letters (a-z)
                name[j] = Character.toString((char) ('a' + rand.nextInt(26)));
            }

            // Print the generated "name" for each iteration
            System.out.println("Generated name " + i + ": " + String.join("", name));
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) return 1;
        else if (score >= 500) return 2;
        else if (score >= 100) return 3;
        else return 4;
    }
}
