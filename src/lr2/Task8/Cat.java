package lr2.Task8;

public class Cat extends Animal{

    String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void pet() {
        System.out.printf("Cat %s is happy now!\n", this.getName());
    }

    @Override
    public void say() {
        System.out.println("Meoooooooooooooooooooooooow");
    }
}
