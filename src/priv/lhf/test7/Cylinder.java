package priv.lhf.test7;

public class Cylinder implements Circle_compute {
    int r;
    int h;

    public Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double area() {
         return PI*r*r;
    }
    @Override
    public double volume() {
        return area() * h;
    }
}
