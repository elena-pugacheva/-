package Units;

public class Spearman extends BaseUnit{

    public Spearman(String name) {
        super(name, 30, 0.6f, 2, 4);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "     Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
