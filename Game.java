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
        Monk monk = new Monk("Gendalf");
        System.out.println(monk);



    }
}
