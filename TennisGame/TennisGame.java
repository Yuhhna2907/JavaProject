package TennisGame;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score)
            return getEvenScore(player1Score);

        if (player1Score >= 4 || player2Score >= 4)
            return getAdvantageOrWin(player1Name, player2Name, player1Score, player2Score);

        return getNormalScore(player1Score, player2Score);
    }

    private static String getEvenScore(int score) {
        return switch (score) {
            case LOVE -> "Love-All";
            case FIFTEEN -> "Fifteen-All";
            case THIRTY -> "Thirty-All";
            case FORTY -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getAdvantageOrWin(String player1Name, String player2Name, int player1Score, int player2Score) {
        int diff = player1Score - player2Score;

        return switch (diff) {
            case 1 -> "Advantage " + player1Name;
            case -1 -> "Advantage " + player2Name;
            default -> (diff >= 2)
                    ? "Win for " + player1Name
                    : "Win for " + player2Name;
        };
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return SCORE_NAMES[player1Score] + "-" + SCORE_NAMES[player2Score];
    }
}

