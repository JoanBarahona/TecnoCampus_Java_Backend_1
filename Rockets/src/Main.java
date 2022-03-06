import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Integer i;

        System.out.println("Fase-1");
        Rockets rocket1 = new Rockets( "32WeSSDS", 3);
        Rockets rocket2 = new Rockets( "LDSFJA32", 6);
        System.out.println("Rocket-1: " + rocket1.name + " and have " + rocket1.numberOfPropulsors + " propulsors. ");
        System.out.println("Rocket-2: " + rocket2.name + " and have " + rocket2.numberOfPropulsors + " propulsors. ");

        System.out.println("Fase-2");
        List<Integer> rocket1Propulsor = new ArrayList<Integer>();
        rocket1Propulsor.add(10);
        rocket1Propulsor.add(30);
        rocket1Propulsor.add(80);
    }

}
