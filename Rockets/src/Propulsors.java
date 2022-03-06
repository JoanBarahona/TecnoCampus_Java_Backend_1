import java.util.*;

public class Propulsors {

    protected Integer minimum;
    protected Integer maximum;

    public Propulsors (Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    public static List<Propulsors> propulsorsPower (List<Integer> maximum) {
        List<Propulsors> propulsorsRangePower = new ArrayList<>();
        for (int i=0;i < maximum.size();i++) {
            Integer maximumPower = maximum.get(i);
            Propulsors propulsorPower = new Propulsors(0, maximumPower);
            propulsorsRangePower.add(propulsorPower);
        }
        return propulsorsRangePower;
    }

    @Override
    public String toString() {
        return "Propulsors{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }

}
