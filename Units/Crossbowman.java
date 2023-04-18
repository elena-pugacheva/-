package Units;

public class Crossbowman extends Shooter{

    public Crossbowman(String name) {
        super(name, 20, 0.5f, 1, 2, 2, 50, 15, 0.5f);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "      Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
