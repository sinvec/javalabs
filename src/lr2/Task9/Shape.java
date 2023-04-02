package lr2.Task9;

public class Shape {

    private String name = "Shape";

    public Shape(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public float getArea() {
        return 0.f;
    }

    public float getPerimeter() {
        return 0.f;
    }

}
