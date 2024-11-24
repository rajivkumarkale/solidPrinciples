package solid.openclosed.bad;

public class Main {
    public static void main(String[] args) {
        BadCalculator calculator = new BadCalculator();
        int sum = calculator.calculateNumber(1, 5, "sum");
        int sub = calculator.calculateNumber(9, 5, "sub");
        System.out.println("1 + 5 = " + sum + " and 9 - 5 = " + sub);
    }
}
