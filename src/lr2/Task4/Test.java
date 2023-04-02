package lr2.Task4;

public class Test {

    public static void main(String[] args) {
        Person person = new Person("Stive", 25, 'm');
        person.setAge(26);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
    }

}
