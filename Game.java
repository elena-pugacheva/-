import Units.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args){
//        Peasant peasant = new Peasant("Aragorn");
//        System.out.println(peasant);
//        System.out.println(peasant.getInfo());
//        System.out.println();

//        Thief thief = new Thief("Karis");
//        System.out.println(thief);
//        System.out.println(thief.getInfo());
//        System.out.println();

//        Spearman spearman = new Spearman("Moris");
//        System.out.println(spearman);
//        System.out.println(spearman.getInfo());
//        System.out.println();

//        Sniper sniper = new Sniper("Legolas");
//        System.out.println(sniper);
//        System.out.println(sniper.getInfo());
//        System.out.println();

//        Crossbowman crossbowman = new Crossbowman("Aris");
//        System.out.println(crossbowman);
//        System.out.println(crossbowman.getInfo());
//        System.out.println();
//
//        Monk monk = new Monk("Gandalf");
//        System.out.println(monk);
//        System.out.println(monk.getInfo());
//        System.out.println();

        ArrayList<BaseUnit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            switch (new Random(). nextInt(6 )){
                case 0:
                    team1.add(new Peasant("Aragorn"));
                    break;
                case 1:
                    team1.add(new Sniper("Legolas"));
                    break;
                case 2:
                    team1.add(new Thief("Karis"));
                    break;
                case 3:
                    team1.add(new Spearman("Moris"));
                    break;
                case 4:
                    team1.add(new Monk("Gandalf"));
                    break;
                case 5:
                    team1.add(new Crossbowman("Aris"));
                }
        }
        ArrayList<BaseUnit> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Peasant("Aragorn"));
                    break;
                case 1:
                    team2.add(new Sniper("Legolas"));
                    break;
                case 2:
                    team2.add(new Thief("Karis"));
                    break;
                case 3:
                    team2.add(new Spearman("Moris"));
                    break;
                case 4:
                    team2.add(new Monk("Gandalf"));
                    break;
                case 5:
                    team2.add(new Crossbowman("Aris"));
            }
        }
        team1.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
        System.out.println();
        team2.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
    }
}
