package lr7.Task8;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
