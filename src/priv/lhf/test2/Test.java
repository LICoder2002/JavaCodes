package priv.lhf.test2;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", "550i", "京NY28588", 600);
        Car car2 = new Car();

        int day1 = 6;
        int day2 = 9;

        float rent1 = car1.carRent(day1);
        System.out.println(rent1);

        System.out.println(car1);

        float rent2 = car2.carRent(day1);
        System.out.println(rent2);

        System.out.println(car2);

    }
}
