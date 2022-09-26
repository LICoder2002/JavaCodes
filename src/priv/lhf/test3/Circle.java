package priv.lhf.test3;

public class Circle {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    double getArea()
    {
        return 3.14 * rad * rad;
    }
}

