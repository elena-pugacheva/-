package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit{
    protected int distance,maxCountBullet,currentCountBullet;
    protected float accuracy;

    Shooter(ArrayList<BaseUnit> gang, String name, float hp, float maxHp, float luck, int speed, int damage, int distance,
            int maxCountBullet, int currentCountBullet, float accuracy) {
        super(gang, name, hp, maxHp, luck, speed, damage);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = currentCountBullet;
        this.accuracy = accuracy;
    }


    void shoot(){

    }
}

