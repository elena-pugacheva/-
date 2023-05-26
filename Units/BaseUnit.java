package Units;

import java.util.ArrayList;
import java.util.Random;


public abstract class BaseUnit implements GameInterface, Comparable {
    protected String name;
    protected float hp, maxHp, luck;
    protected int speed, damage;
    protected ArrayList<BaseUnit> gang;
    protected Coordinate coordinate;


    BaseUnit(ArrayList<BaseUnit> gang, String name, float hp, float maxHp, float luck, int speed, int damage, int x, int y) {
        this.gang = gang;
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        if (new Random().nextBoolean()) this.hp -= 8;
        this.luck = luck;
        this.speed = speed;
        this.damage = damage;
        this.coordinate = new Coordinate(x, y);

    }


    @Override
    public String toString() {
        return name;
    }


    public void getDamage(float damage) {
        this.hp -= damage;
    }

    @Override
    public int compareTo(Object o) {
        BaseUnit baseUnit = (BaseUnit) o;
        return baseUnit.speed - this.speed;
    }


    public int[] getCoords() {
        return new int[]{coordinate.x, coordinate.y};
    }

    public float getHp() {
        return hp;
    }

    protected void move(BaseUnit target) {
        float dx = target.coordinate.distanceXY(this.coordinate)[0];
        float dy = target.coordinate.distanceXY(this.coordinate)[1];
        if (Math.abs(dx) < Math.abs(dy)) {
            if (dy > 0) {
                if (isEmptyPosition(this.coordinate.x, this.coordinate.y - 1)) {
                    this.coordinate.y--;
                }

            } else {
                if (isEmptyPosition(this.coordinate.x, this.coordinate.y + 1)) {
                    this.coordinate.y++;
                }

            }
        } else {
            if (dx > 0) {
                if (isEmptyPosition(this.coordinate.x - 1, this.coordinate.y)) {
                    this.coordinate.x--;
                }

            } else {
                if (isEmptyPosition(this.coordinate.x + 1, this.coordinate.y)) {
                    this.coordinate.x++;
                }

            }
        }
    }

    public void step(ArrayList<BaseUnit> enemy) {
        if (hp <= 0) {
            return;
        }
        float min = Float.MAX_VALUE;
        BaseUnit target = null;
        for (BaseUnit unit : enemy) {
            if (unit.hp <= 0) continue;
            float temp = unit.coordinate.getDistance(this.coordinate);
            if (temp < min) {
                min = temp;
                target = unit;
            }
            if (temp < 2) {
                target.getDamage(this.damage);
            } else {
                move(target);
            }
        }
    }

    protected boolean isEmptyPosition(int x, int y) {
        for (BaseUnit unit : gang) {
            if (unit.coordinate.x == x && unit.coordinate.y == y) {
                if (unit.hp > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

