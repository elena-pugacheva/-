package Units;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(name, 20, 0.6f, 2, 4, 5, 10, 3, 0.5f);
    }

    public void step() {

    }
    @Override
    public String toString() {
        return "Лучник";
    }

    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
