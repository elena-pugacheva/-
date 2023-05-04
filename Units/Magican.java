package Units;

import java.util.ArrayList;

public abstract class Magican extends BaseUnit{

    protected float maxMana;
    protected float mana;

    Magican(ArrayList<BaseUnit> gang, String name, float hp, float maxHp, float luck, int speed, int damage, float mana, float maxMana, int x, int y) {
        super(gang, name, hp, maxHp, luck, speed, damage, x, y);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    void Heal(){

    }
}
