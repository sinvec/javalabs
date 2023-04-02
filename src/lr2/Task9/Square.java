package lr2.Task9;

public class Square extends Shape{

    private float side = 0.f;

    public Square(String name, float side) {
        super(name);
        this.setSide(side);
    }

    public float getSide() {
        return this.side;
    }

    public void setSide(float side) {
        if (side >= 0.f) {
            this.side = side;
        }
    }

    @Override
    public float getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public float getPerimeter() {
        return this.getSide() * 4.0f;
    }

}



