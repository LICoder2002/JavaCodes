package priv.lhf.test6;

import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            String str = input.next();
            if(str.equals("Circle")) {
                Circle c = new Circle(input.nextDouble());
                System.out.println("The area of " + c.toString() + " is " + String.format("%.2f",c.getArea()));
                System.out.println("The perimeterof " + c.toString() + " is "+ String.format("%.2f",c.getPerimeter()));
            } else if(str.equals("Cylinder")) {
                Cylinder r = new Cylinder(input.nextDouble(), new Circle(input.nextDouble()));
                System.out.println("The area of " + r.toString() + " is " + String.format("%.2f",r.getArea()));
                System.out.println("The volume of " + r.toString() + " is " + String.format("%.2f",r.getVolume()));
            }
        }
    }
}

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
        radius = 0;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return "Circle(r:" + radius + ")";
    }
}

class Cylinder{
    private double height;
    private Circle circle;

    public Cylinder(double height, Circle circle){
        this.height = height;
        this.circle = circle;
    }
    public Cylinder(){
        height = 0;
        circle = new Circle(0);
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setCircle(Circle circle){
        this.circle = circle;
    }
    public Circle getCircle(){
        return circle;
    }
    public double getArea(){
        return 2 * Math.PI * circle.getRadius() * circle.getRadius() + 2 * Math.PI * circle.getRadius() * height;
    }
    public double getVolume(){
        return Math.PI * circle.getRadius() * circle.getRadius() * height;
    }
    @Override
    public String toString(){
        return "Cylinder(h:" + height + "," + circle.toString() + ")";
    }
}
