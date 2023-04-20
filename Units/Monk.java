package Units;

public class Monk extends Magican {

    public Monk(String name) {
        super(name, 20, 0.5f, 1, 1, 20);
    }

    public String toString() {
        return "Монах";
    }

    @Override
    public void step() {

    }
    @Override
    public String getInfo() {
        return " Имя: " + name + "   Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage + "   Мана: " + mana;
    }
}
