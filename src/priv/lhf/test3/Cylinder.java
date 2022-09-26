package priv.lhf.test3;

public class Cylinder {
    private Circle bottom;

    private float h;

    public Cylinder(Circle bottom, float h) {
        this.bottom = bottom;
        this.h = h;
    }

    public Circle getBottom() {
        return bottom;
    }

    public void setBottom(Circle bottom) {
        this.bottom = bottom;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    double getVolume()
    {
        return bottom.getArea() * h;
    }
}
