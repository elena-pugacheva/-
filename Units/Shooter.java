package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit{
    protected int distance,maxCountBullet,currentCountBullet;
    protected float accuracy;

    Shooter(ArrayList<BaseUnit> gang, String name, float hp, float maxHp, float luck, int speed, int damage, int distance,
            int maxCountBullet, int currentCountBullet, float accuracy, int x, int y) {
        super(gang, name, hp, maxHp, luck, speed, damage, x, y);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = currentCountBullet;
        this.accuracy = accuracy;
    }


    @Override
    public void step(ArrayList<BaseUnit> enemy) {
        if (hp <= 0 || accuracy <= 0) {
            return;
        }
        float min = Float.MAX_VALUE;
        BaseUnit target = null;
        for (BaseUnit unit: enemy) {
            float temp = unit.coordinate.getDistance(this.coordinate);
            if (temp < min){
                min = temp;
                target = unit;
        }
        }
        System.out.println(name + " стреляет в " + target.name);
        for (BaseUnit unit:gang){
            if(unit instanceof Peasant){
                if(!(unit.hp <= 0) && ((Peasant)unit).readiness){
                    ((Peasant)unit).readiness = false;
                    return;
                }
                this.currentCountBullet--;
            }
        }
    }
}

