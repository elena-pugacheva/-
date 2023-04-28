package Units;

import java.util.ArrayList;

public class Sniper extends Shooter{

    public Sniper(ArrayList<BaseUnit> gang, String name) {
        super(gang, name, 20f, 40f, 2f, 8, 5, 10, 3, 2, 6);
    }

    public void step() {

    }
    @Override
    public String toString() {
        return "Лучник";
    }

    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Макс.здоровье: " + maxHp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
