package solid.dependencyinversion.good;

/*
    The below code now adheres to the Dependency Inversion Principle
    which states that
    Entities must depend on abstractions, not on concretions.
        It states that the high-level module must not depend on the low-level module,
        but they should depend on abstractions.

    =====
    1. High-Level Module (Calculator) Depends on Abstraction:
        -> The Calculator class no longer depends directly on AddOperation or SubOperation.
           Instead, it relies on the abstraction CalculatorOperation.

        -> This eliminates tight coupling between the Calculator and specific operations.

    2. Abstractions Are Independent of Details:
        The CalculatorOperation interface is generic and doesn't depend on the details of AddOperation or SubOperation.
 */

public class Calculator {
    public int calculate(int a, int b, CalculatorOperation operation){
        return operation.calculate(a, b);
    }
}
