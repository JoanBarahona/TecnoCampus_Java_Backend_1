import java.util.List;

public class Rockets {

    protected String name;
    protected Integer numberOfPropulsors;

    public Rockets(String name, Integer numberOfPropulsors) {
        this.name = name;
        this.numberOfPropulsors = numberOfPropulsors;
    }

    public static List<Integer> speedUp(List<Integer> currentPower, List<Propulsors> propulsorRangePower) {
        for (int i = 0; i < currentPower.size(); i++) {
            if (currentPower.get(i) <= (propulsorRangePower.get(i).maximum - 10)) {
                currentPower.set(i, (currentPower.get(i) + 10));
            }
        }
        return currentPower;
    }
    public static List<Integer> speedDown(List<Integer> currentPower, List<Propulsors> propulsorRangePower) {
        for (int i = 0; i < currentPower.size(); i++) {
            if (currentPower.get(i) >= (propulsorRangePower.get(i).minimum + 10)) {
                currentPower.set(i, (currentPower.get(i) - 10));
            }
        }
        return currentPower;
    }

}
