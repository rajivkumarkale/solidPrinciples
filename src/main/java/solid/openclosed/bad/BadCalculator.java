package solid.openclosed.bad;

/*
    This is an example of Bad design where we are taking String "type"
    -> Now if want to add a new operation e.g. division we will have to modify class.
    -> It breaks the Open closed principle which states that
       classes should be Open for extension but closed for modification.
 */
public class BadCalculator {
    public int calculateNumber(int number1, int number2, String type){
        int result = 0;
        switch(type){
            case "sum":
                result = number1 + number2;
                break;
            case "sub":
                result = number1 - number2;
                break;
            default:
                break;
        }
        return result;
    }
}
