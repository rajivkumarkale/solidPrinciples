package solid.openclosed.good;

/*
    Open-Closed Principle
    It states that
        Objects or entities should be open for extension but closed for modification.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation addOperation = new AddOperation();
        System.out.println("1 + 5 = " + calculator.calculateNumber(1, 5, addOperation));

        Operation subtractOperation = new SubtractOperation();
        System.out.println("9 - 5 = " + calculator.calculateNumber(9, 5, subtractOperation));
    }
}
