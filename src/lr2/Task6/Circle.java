package lr2.Task6;

public class Circle implements Shape{

    private float raduis = 0.f;

    public Circle(float raduis) {
        this.setRaduis(raduis);
    }

    public void setRaduis(float raduis) {
        if (raduis >= 0.f) {
            this.raduis = raduis;
        }
    }

    public float getRadius() {
        return this.raduis;
    }

    public float getArea() {
        return (float)Math.PI * this.getRadius() * this.getRadius();
    }

    public float getPerimeter() {
        return 2.f * (float)Math.PI * this.getRadius();
    }


}
