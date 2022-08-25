package junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int sum = c.add(1, 3);
        System.out.println(sum);
    }
}
