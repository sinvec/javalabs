package lr2.Task8;

public class Animal {

    private String name = "Some Animal";

    private int age = 0;

    public Animal (String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.printf("%s: some wierd sound ...\n", this.name);
    }
}
