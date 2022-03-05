import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Player> players = buildPlayerList();

        Player playerMaxPoints = getPlayerMaxPoints(players);

        double avgPoints = calculateAvgPoints(players);
        System.out.println("The team point measurement " + " is " + avg);

        List<Player> top5MaxPoints = getTop5MaxPoints(players);
        System.out.println(" The top 5 scorers in the League are: " +top5MaxPoints);
    }

    private static double calculateAvgPoints(List<Player> players) {
        double sum = 0;

        for (int i = 0; i < players.size(); i++) {
            Player currentPlayer = player.get(i);
            sum = sum + currentPlayer.getNumPoints();
        }

        double avgPoints = sum / players.size();

        return avgPoints;
    }
}
