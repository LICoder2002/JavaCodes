package priv.lhf.test2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("宝马", "550i", "京NY28588", 600);

        int day1 = 6;
        int day2 = 9;


        float rent = car.carRent(day1);
        System.out.println(rent);


        rent = car.carRent(day2);
        System.out.println(rent);

    }
}
