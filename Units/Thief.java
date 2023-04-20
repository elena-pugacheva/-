package Units;

public class Thief extends BaseUnit{

    public Thief(String name) {
        super(name, 20, 0.8f, 3, 2);
    }

    void dodge(){

    }
    void stealth(){

    }

    public String toString() {
        return "Разбойник";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return " Имя: " + name + "     Здоровье: " + hp + "   Удача: " + luck + "   Скорость: " + speed + "   Урон: " + damage;
    }
}
