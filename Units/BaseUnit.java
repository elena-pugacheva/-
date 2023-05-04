package Units;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


public abstract class BaseUnit implements GameInterface, Comparable{
    protected String name;
    protected float hp, maxHp, luck;
    protected int speed, damage;
    protected ArrayList<BaseUnit> gang;
    protected Coordinate coordinate;




    BaseUnit(ArrayList<BaseUnit> gang, String name, float hp, float maxHp, float luck, int speed, int damage, int x, int y){
        this.gang = gang;
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        if(new Random().nextBoolean()) this.hp-=8;
        this.luck = luck;
        this.speed = speed;
        this.damage = damage;
        this.coordinate = new Coordinate(x, y);

    }


    @Override
    public String toString() {
        return name;
    }


    public void getDamage(float damage){
        this.hp -= damage;
        if (this.hp > this.maxHp){
            this.hp = this.maxHp;
        }
        if (this.hp < 0){
            this.hp = 0;
        }
    }

    @Override
    public int compareTo(Object o) {
        BaseUnit baseUnit = (BaseUnit) o ;
        return baseUnit.speed - this.speed;
    }




}
