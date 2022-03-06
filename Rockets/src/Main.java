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

        List<Integer>rocket2Propulsor = new ArrayList<Integer>();
        rocket2Propulsor.add(30);
        rocket2Propulsor.add(40);
        rocket2Propulsor.add(50);
        rocket2Propulsor.add(50);
        rocket2Propulsor.add(30);
        rocket2Propulsor.add(10);

        System.out.println(rocket1.name + ": " + Rockets.toString(rocket1Propulsor));
        System.out.println(rocket2.name + ": " + Rockets.toString(rocket2Propulsor));

        System.out.println("Fase 3 and 4 ");

        List<Propulsors> propulsorR1RangePower = Propulsors.propulsorsPower(rocket1Propulsor);
        List<Propulsors> propulsorR2RangePower = Propulsors.propulsorsPower(rocket2Propulsor);

        List<Integer> actualR1Power = new ArrayList<>();
        List<Integer> actualR2Power = new ArrayList<>();

        float r1ActualSpeed = 0;
        float r2ActualSpeed = 0;

        for (i=0;i < propulsorR1RangePower.size();i++) {
            actualR1Power.add(0);
        }
        for (i=0;i < propulsorR1RangePower.size();i++) {
            actualR2Power.add(0);
        }

        String continueOption = " Y ";

        while (continueOption.equalsIgnoreCase("y")) {
            System.out.println("- Which rocket do you want to change the propulsor power 1 o 2 ? ");
            String rocketOption = new Scanner(System.in).nextLine();
            System.out.println(" Do you want to speed up (U) or speed down (D) ? ");
            String speedOption = new Scanner(System.in).nextLine();

            if (speedOption.equalsIgnoreCase("u")) {
                if (rocketOption.equals("1")) {
                    actualR1Power = Rockets.speedUp(actualR1Power, propulsorR1RangePower);
                    r1ActualSpeed = Rockets.speed(actualR1Power,propulsorR1RangePower, r1ActualSpeed); //fase 4
                    System.out.println("Rocket " + rocket1.name + " actual propulsors power " + Rockets.toString(actualR1Power) +
                            " with a speed of: " + r1ActualSpeed);
                    if (actualR1Power.equals(rocket1Propulsor)){
                        System.out.println("The propulsors on this rocket are at maximum power");
                    }
                } else if (rocketOption.equals("2")) {
                    actualR2Power = Rockets.speedUp(actualR2Power, propulsorR2RangePower);
                    r2ActualSpeed = Rockets.speed(actualR2Power,propulsorR2RangePower, r2ActualSpeed);//fase 4
                    System.out.println("Rocket " + rocket2.name + " actual propulsors power " + Rockets.toString(actualR2Power) +
                            " with a speed of: " + r2ActualSpeed);
                    if (actualR2Power.equals(rocket2Propulsor)){
                        System.out.println("The propulsors on this rocket are at maximum power");
                    }
                } else {
                    new Exception("Is not a valid option of rocket");
                }
            }else if (speedOption.equalsIgnoreCase("d")) {
                if (rocketOption.equals("1")) {
                    actualR1Power = Rockets.speedDown(actualR1Power, propulsorR1RangePower);
                    r1ActualSpeed = Rockets.speed(actualR1Power,propulsorR1RangePower, r1ActualSpeed);//fase 4
                    System.out.println("Rocket " + rocket1.name + " actual propulsors power " + Rockets.toString(actualR1Power) +
                            " with a speed of: " + r1ActualSpeed);
                } else if (rocketOption.equals("2")) {
                    actualR2Power = Rockets.speedDown(actualR2Power, propulsorR2RangePower);
                    r2ActualSpeed = Rockets.speed(actualR2Power,propulsorR2RangePower, r2ActualSpeed);//fase 4
                    System.out.println("Rocket " + rocket2.name + " actual propulsors power " + Rockets.toString(actualR2Power) +
                            " with a speed of: " + r2ActualSpeed);
                } else {
                    new Exception("Is not a valid option of rocket");
                }
            } else {
                new Exception("This is not a valid option of change of speed");
            }
            System.out.println("Do you want continue changing the propulsors power Y/N?");
            continueOption = new Scanner(System.in).nextLine();
        }
    }

}
