package Units;

import java.util.ArrayList;

public class Monk extends Magican {

    public Monk( ArrayList<BaseUnit> gang, String name, int x, int y) {
        super(gang, name, 20f, 50f, 1, 4, 20, 30f, 50f, x, y);
    }

    public String toString() {
        return "Монах";
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy) {
        if (this.mana > 0 && this.hp > 0){
            for (BaseUnit unit: gang){
                if (unit.hp > 0 && unit.hp < unit.maxHp){
                    unit.getDamage(-damage);
                    this.mana --;
                }
            }
        }
    }
    @Override
    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage + "   Мана: " + mana;
    }
}
