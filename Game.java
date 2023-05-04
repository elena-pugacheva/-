import Units.*;

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
        for (int i = 1; i < 11; i++){
            switch (new Random(). nextInt(6 )){
                case 0:
                    team1.add(new Peasant(team1,"Aragorn", 1, i));
                    break;
                case 1:
                    team1.add(new Sniper(team1,"Legolas", 1, i));
                    break;
                case 2:
                    team1.add(new Thief(team1,"Karis", 1, i));
                    break;
                case 3:
                    team1.add(new Spearman(team1,"Moris", 1, i));
                    break;
                case 4:
                    team1.add(new Monk(team1,"Gandalf", 1, i));
                    break;
                case 5:
                    team1.add(new Crossbowman(team1,"Aris", 1, i));
                }
        }
        ArrayList<BaseUnit> team2 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Peasant(team2,"Aragorn", 10, i));
                    break;
                case 1:
                    team2.add(new Sniper(team2,"Legolas", 10, i));
                    break;
                case 2:
                    team2.add(new Thief(team2,"Karis", 10, i));
                    break;
                case 3:
                    team2.add(new Spearman(team2,"Moris", 10, i));
                    break;
                case 4:
                    team2.add(new Monk(team2,"Gandalf", 10, i));
                    break;
                case 5:
                    team2.add(new Crossbowman(team2,"Aris", 10, i));
            }
        }
        team1.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
        System.out.println();
        team2.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
        System.out.println();

        team1.forEach(n -> n.step(team2));
        team2.forEach(n -> n.step(team1));

        team1.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
        System.out.println();
        team2.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
        System.out.println();

        ArrayList<BaseUnit> team3 = new ArrayList<>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(BaseUnit::compareTo);
        team3.forEach(n -> System.out.println(n.toString() + "   " + n.getInfo()));
        System.out.println();





    }
}
