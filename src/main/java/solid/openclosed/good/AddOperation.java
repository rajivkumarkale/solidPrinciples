package solid.openclosed.good;

public class AddOperation implements Operation {

    @Override
    public int performOperation(int number1, int number2) {
        return number1 + number2;
    }
}
