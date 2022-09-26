package priv.lhf.test3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);

        Cylinder cylinder = new Cylinder(circle, 1);
        double volume = cylinder.getVolume();

        System.out.println(volume);
    }
}
