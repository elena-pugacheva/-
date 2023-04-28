package Units;

import java.util.ArrayList;

public class Spearman extends BaseUnit{

    public Spearman(ArrayList<BaseUnit> gang, String name) {
        super(gang, name, 30f, 40f, 15f, 6,10);
    }

    public String toString() {
        return "Копейщик";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "     Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
