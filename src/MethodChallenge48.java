public class MethodChallenge48 {

    public static void main(String[] args) {
        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Damian", scorePosition);

        scorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Damian2", scorePosition);

        scorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Damian3", scorePosition);

        scorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Damian4", scorePosition);

        scorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Damian5", scorePosition);


    }
    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the high score list");

        }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}



