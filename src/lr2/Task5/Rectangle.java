package lr2.Task5;

public class Rectangle {

    private float height = 0.f;

    private float width = 0.f;

    public Rectangle(float width, float height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        if (width >= 0.f){
            this.width = width;
        }
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        if (height >= 0.f) {
            this.height = height;
        }
    }

    public float getArea() {
        return this.getWidth() * this.getHeight();
    }

    public float getPerimeter() {
        return this.getWidth() * 2.0f + this.getHeight() * 2.f;
    }
}
