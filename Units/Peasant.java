package Units;

public class Peasant extends BaseUnit {
     public Peasant(String name) {
        super(name, 10, 0.5f, 1,1);
    }

    public String toString() {
        return "Крестьянин";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
