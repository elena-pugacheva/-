package Units;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    protected boolean readiness;
     public Peasant(ArrayList<BaseUnit> gang, String name, int x, int y) {
        super(gang, name, 10f, 20f, 5f,2, 10, x, y);
        this.readiness = true;

    }

    public String toString() {
        return "Крестьянин";
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy) {
        if (readiness){
            System.out.println(this + " " + this.name + " ничего не делает ");
        } else{
            readiness = true;
            System.out.println(this + " " + this.name + " находит припасы ");
        }
    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }

}
