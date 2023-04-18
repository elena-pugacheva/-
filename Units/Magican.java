package Units;

public abstract class Magican extends BaseUnit{
    protected float mana;
    Magican(String name, float hp, float luck, int speed, int damage, float mana) {
        super(name, hp, luck, speed, damage);
        this.mana = mana;
    }

    void Heal(){

    }
}
