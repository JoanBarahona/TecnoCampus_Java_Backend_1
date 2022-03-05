import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Player> players = buildPlayerList();

        Player playerMaxPoints = getPlayerMaxPoints(players);
        System.out.println(playerMaxPoints);

        double avgPoints = calculateAvgPoints(players);
        System.out.println(avgPoints);

        String team = "UOC";
        double avg = calculatePointsByTeam(players, team);
        System.out.println("The team point measurement " + team + " is " + avg);

        List<Player> top5MaxPoints = getTop5MaxPoints(players);
        System.out.println(" The top 5 scorers in the League are: " +top5MaxPoints);
    }

    private static double calculateAvgPoints(List<Player> players) {
        double sum = 0;

        for (int i = 0; i < players.size(); i++) {
            Player currentPlayer = players.get(i);
            sum = sum + currentPlayer.getNumPoints();
        }

        double avgPoints = sum / players.size();

        return avgPoints;
    }

    private static List<Player> buildPlayerList() {

        List<Player> players = new ArrayList<>();

        Player mark = new Player("Mark", 89, "TCM", 1.75,13);
        Player john = new Player("john", 80, "TCM", 1.82,11);
        Player Kelly = new Player("Kelly", 45, "UPC", 1.65, 5);
        Player Penelope = new Player("Penelope", 75, "BDN", 1.75,6);
        Player Bruno = new Player("Bruno", 91, "BDN", 2.00, 13);
        Player Matt = new Player("Matt", 68, "BDN", 1.91, 14);
        Player Karl = new Player("Karl", 49, "UOC", 1.50,12);
        Player Stephy = new Player("Stephy", 65, "UOC",1.79, 10);
        Player Lucas = new Player("Lucas", 90, "UOC", 1.93,19);

        players.add(mark);
        players.add(john);
        players.add(Kelly);
        players.add(Penelope);
        players.add(Bruno);
        players.add(Matt);
        players.add(Karl);
        players.add(Stephy);
        players.add(Lucas);

        return players;
    }

    private static Player getPlayerMaxPoints(List<Player> players) {

        Player playerMaxPoints = players.get(0);

        for (int i = 0; i < players.size(); i++) {
            Player currentPlayer = players.get(i);

            if (currentPlayer.getNumPoints() > playerMaxPoints.getNumPoints()) {
                playerMaxPoints = currentPlayer;
            }
        }
        return playerMaxPoints;

    }

    private static double calculatePointsByTeam(List<Player> players, String team) {

        List<Player> playerFromTeam = new ArrayList<>();

        for (Player currentPlayer : players) {
            if (currentPlayer.getTeam().equalsIgnoreCase(team)) {
                playerFromTeam.add(currentPlayer);
            }
        }
        double totalPoints = 0;

        for (Player currentPlayer : playerFromTeam) {
            totalPoints = totalPoints + currentPlayer.getNumPoints();
        }
        double avg = totalPoints / playerFromTeam.size();

        return avg;
    }
    private static List<Player> getTop5MaxPoints(List<Player> players) {
        return players.stream()
                .sorted(Comparator.comparing(Player::getNumPoints))
                .limit(5)
                .collect(Collectors.toList());
    }
}
