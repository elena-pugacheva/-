package Units;

import java.util.ArrayList;

public class Spearman extends BaseUnit{

    public Spearman(ArrayList<BaseUnit> gang, String name, int x, int y) {
        super(gang, name, 30f, 40f, 15f, 6,10, x, y);
    }

    public String getInfo() {
        return "Копейщик";
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy) {

    }

    @Override
    public String toString() {
        return " Имя: " + name + "     Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
