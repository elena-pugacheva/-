import Units.*;

public class Game {
    public static void main(String[] args){
        Peasant peasant = new Peasant("Aragorn");
        System.out.println(peasant);
        Thief thief = new Thief("Karis");
        System.out.println(thief);
        Spearman spearman = new Spearman("Moris");
        System.out.println(spearman);
        Sniper sniper = new Sniper("Legolas");
        System.out.println(sniper);
        Crossbowman crossbowman = new Crossbowman("Aris");
        System.out.println(crossbowman);
        Monk monk = new Monk("Gandalf");
        System.out.println(monk);
        System.out.println();
        System.out.println(sniper.getInfo());
        System.out.println(thief.getInfo());
        System.out.println(spearman.getInfo());
        System.out.println(peasant.getInfo());
        System.out.println(crossbowman.getInfo());
        System.out.println(monk.getInfo());




    }
}
