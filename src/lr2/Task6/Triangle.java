package lr2.Task6;

public class Triangle implements Shape{

    private float a = 0.f;

    private float b = 0.f;

    private float c = 0.f;

    public Triangle(float a, float b, float c) {
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

    public float getPerimeter() {
        return this.getA() + this.getB() + this.getC();
    }

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
