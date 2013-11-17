
public class TennisGame1 implements TennisGame {

    private int player1Points = 0;
    private int player2Points = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            player1Points += 1;
        else
            player2Points += 1;
    }

    public String getScore() {
        if (player1Points == player2Points) {
            return getEqualityScore();
        } else if (player1Points > Points.getMaximumPoints().getPlayerPoints() || player2Points > Points.getMaximumPoints().getPlayerPoints()) {
            return getAdvantageOrWinScore();
        }
        return getOtherScore();
    }

    private String getOtherScore() {
        return Points.getPoints(player1Points).getScore() + "-" + Points.getPoints(player2Points).getScore();
    }

    private String getAdvantageOrWinScore() {
        boolean isVictory = Math.abs(player1Points - player2Points) >= 2;
        String scoreSuffix = isVictory ? "Win for" : "Advantage";

        String playerWithMorePoints = player1Points > player2Points ? player1Name : player2Name;

        return scoreSuffix + " " + playerWithMorePoints;
    }

    private String getEqualityScore() {
        return Points.getPoints(player1Points).getEqualityScore();
    }
}
