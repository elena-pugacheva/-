package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
     public Peasant(ArrayList<BaseUnit> gang, String name) {
        super(gang, name, 10f, 20f, 5f,2, 10);
    }

    public String toString() {
        return "Крестьянин";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
