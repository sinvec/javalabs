package lr2.Task9;

public class Triangle extends Shape{

    private float a = 0.f;

    private float b = 0.f;

    private float c = 0.f;

    public Triangle(String name, float a, float b, float c) {
        super(name);
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public float getC() {
        return this.c;
    }

    public void setA(float a) {
        if (a >= 0.f) {
            this.a = a;
        }
    }

    public void setB(float b) {
        if (b >= 0.f) {
            this.b = b;
        }
    }

    public void setC(float c) {
        if (c >= 0.f) {
            this.c = c;
        }
    }

    @Override
    public float getPerimeter() {
        return this.getA() + this.getB() + this.getC();
    }

    @Override
    public float getArea() {
        float polu_per = this.getPerimeter() / 2.f;
        return (float)Math.sqrt(
                polu_per *
                        (polu_per - this.getA()) *
                        (polu_per - this.getB()) *
                        (polu_per - this.getC())
        );
    }

}
