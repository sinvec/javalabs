package lr2.Task6;

public class Square implements Shape{

    private float side = 0.f;

    public Square(float side) {
        this.setSide(side);
    }

    public void setSide(float side) {
        if (side >= 0.f) {
            this.side = side;
        }
    }

    public float getSide() {
        return side;
    }

    public float getArea() {
        return this.getSide() * this.getSide();
    }

    public float getPerimeter() {
        return this.getSide() * 4.0f;
    }
}
