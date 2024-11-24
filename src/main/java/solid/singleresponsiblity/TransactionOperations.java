package solid.singleresponsiblity;

import java.math.BigDecimal;

public class TransactionOperations {
    // This is correct place, as deposit is moved from AccountOperations to TransactionOperations
    public void deposit(BigDecimal amount, int accountNumber) {
        // Getting Account details is the job of AccountOperations class
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
