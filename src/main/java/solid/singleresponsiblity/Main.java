package solid.singleresponsiblity;

import java.math.BigDecimal;

/*
    Single-Responsibility Principle
    It states that
        A class should have one and only one reason to change, meaning that a class should have only one job.
 */
public class Main {
    public static void main(String[] args){
        Account account = new Account(123, "Rajiv", BigDecimal.ZERO);

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(100000), 123);
        System.out.println(account.getTotalAmount());

        transactionOperations.withdraw(BigDecimal.valueOf(40000), 123);
        System.out.println(account.getTotalAmount());
    }
}
