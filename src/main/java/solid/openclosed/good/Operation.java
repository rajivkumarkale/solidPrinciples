package solid.openclosed.good;

/*
    This is better Approach because if we want to add more features
     for e.g. division operator then we can don't need to modify any
     existing class, we can just add a new DivisionOperation class which
     implements the Operation Interface.
 */
public interface Operation {
    public int performOperation(int number1, int number2);
}
