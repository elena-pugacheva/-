package Units;

public class Shooter extends BaseUnit{
    protected int distance,maxCountBullet,currentCountBullet;
    protected float accuracy;

    Shooter(String name, float hp, float luck, int speed, int damage,int distance,
            int maxCountBullet, int currentCountBullet, float accuracy) {
        super(name, hp, luck, speed, damage);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = currentCountBullet;
        this.accuracy = accuracy;
    }


    void shoot(){

    }
}

