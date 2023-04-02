package lr2.Task9;

public class Circle extends Shape{

    private float radius = 0.f;

    public Circle(String name, float radius) {
        super(name);
        this.setRadius(radius);
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        if (radius >= 0.f) {
            this.radius = radius;
        }
    }

    @Override
    public float getArea() {
        return (float)Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public float getPerimeter() {
        return 2.f * (float)Math.PI * this.getRadius();
    }

}
