public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.origin = origin;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("Модель: %s \nМарка: %s \nСтрана %s \nМасса: %.2f \nВысота: %.3f \nСкорость: %d \nСила: %d \nБроня: %d",
                modelName, mark, origin, height, weight, speed, strength, armor);
    }

    public boolean drift() {
        System.out.println("Вы вошли дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов ");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useWeapon() {
        System.out.println("Fire!");
    }
}