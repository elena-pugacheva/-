package Units;

import java.util.ArrayList;

public class Thief extends BaseUnit{

    public Thief(ArrayList<BaseUnit> gang, String name) {
        super(gang, name, 20f, 25f, 3f, 5, 10);
    }

    void dodge(){

    }
    void stealth(){

    }

    public String toString() {
        return "Разбойник";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "     Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }

}
