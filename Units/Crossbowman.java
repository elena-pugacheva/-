package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{

    public Crossbowman( ArrayList<BaseUnit> gang, String name) {
        super(gang, name,20f, 60f, 7f, 7, 2, 50, 15, 20, 20);
    }

    public String toString() {
        return "Арбалетчик";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "      Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
