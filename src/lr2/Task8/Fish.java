package lr2.Task8;

public class Fish extends Animal{

    private String color;

    public Fish(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public void feed() {
        System.out.printf("Fish %s is happy now!\n", this.getName());
    }

    @Override
    public void say() {
        System.out.println("Boule ...");
    }

}
