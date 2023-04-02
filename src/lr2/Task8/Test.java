package lr2.Task8;

public class Test {

    public static void main(String[] args) {
        Cat my_cat = new Cat("Susie", 2, "Siamese");
        my_cat.say();
        my_cat.pet();

        Fish my_fish = new Fish("Fishy", 1, "gold");
        my_fish.say();
        my_fish.feed();
    }
}
