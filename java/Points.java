
public enum Points {
    ZERO(0, "Love", "Love-All"),
    FIFTEEN(1, "Fifteen", "Fifteen-All"),
    THIRTY(2, "Thirty", "Thirty-All"),
    FORTY(3, "Forty", "Deuce");

    private final int playerPoints;
    private final String score;
    private final String equalityScore;

    private Points(int playerPoints, String score, String equalityScore) {
        this.playerPoints = playerPoints;
        this.score = score;
        this.equalityScore = equalityScore;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public String getScore() {
        return score;
    }

    public String getEqualityScore() {
        return equalityScore;
    }

    public static Points getPoints(int playerPoints) {
        for (Points point : Points.values()) {
            if (point.getPlayerPoints() == playerPoints) {
                return point;
            }
        }
        return Points.FORTY;
    }
}
