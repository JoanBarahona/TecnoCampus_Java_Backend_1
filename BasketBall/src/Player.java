import java.util.Objects;

public class Player {

    private String name;
    private int numPoints;
    private String team;
    private double height;
    private int numBounces;

    public Player(String name, int numPoints, String team, double height, int numBounces) {
        this.name = name;
        this.numPoints =numPoints;
        this.team = team;
        this.height = height;
        this.numBounces = numBounces;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumBounces() {
        return numBounces;
    }

    public void setNumBounces(int numBounces) {
        this.numBounces = numBounces;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return numPoints == player.numPoints && Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", numPoints=" + numPoints +
                ", team='" + team + '\'' +
                '}';
    }
}
