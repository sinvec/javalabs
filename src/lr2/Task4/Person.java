package lr2.Task4;

public class Person {

    private String name;
    private int age = 1;
    private char sex = 'm';

    public Person(String name, int age, char sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
