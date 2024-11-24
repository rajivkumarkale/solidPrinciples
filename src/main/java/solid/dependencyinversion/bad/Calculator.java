package solid.dependencyinversion.bad;

/*
    Dependency Inversion Principle
    It states that
        Entities must depend on abstractions, not on concretions.
        It states that the high-level module must not depend on the low-level module,
            but they should depend on abstractions.

    =====
    This code violates the Dependency Inversion Principle (DIP), which states that:

    -> High-level modules (e.g., Calculator) should not depend on low-level modules (e.g., AddOperation, SubOperation).
        Both should depend on abstractions.

    -> Abstractions should not depend on details.
        Details (e.g., implementations like AddOperation, SubOperation) should depend on abstractions.

    ====
    1. Tight Coupling Between Calculator and Operations:
        The Calculator class directly creates and uses instances of AddOperation and SubOperation.
        This makes Calculator tightly coupled to these specific operation implementations.

    2. No Use of Abstractions:
        There is no abstraction (like an interface or base class) that AddOperation and SubOperation depend on.
        This violates the DIP's emphasis on programming to abstractions.

    3. Rigid Design:
        Adding a new operation (e.g., multiplication or division) would require modifying the Calculator class,
        which violates the Open/Closed Principle (OCP) as well.
        The Calculator should ideally remain open for extension but closed for modification.
 */

public class Calculator {
    public int calculate(int a, int b, String operation){
        int result = 0;
        switch (operation){
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(a, b);
                break;
            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(a, b);
                break;
        }

        return result;
    }
}
