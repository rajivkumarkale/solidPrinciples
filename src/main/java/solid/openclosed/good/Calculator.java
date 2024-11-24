package solid.openclosed.good;

// No modifications in our calculator functionality
// We can keep adding extension by create new operation classes that implements Operation Interface
public class Calculator {
    public int calculateNumber(int number1, int number2, Operation operation) {
        return operation.performOperation(number1, number2);
    }
}
