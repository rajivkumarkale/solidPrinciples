package solid.singleresponsiblity;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static final Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }

    /*
        The following method deposit should not be a part of AccountOperation class
        -> It violates the Single Responsibility Principle.
        -> Create a new class which does the Transaction Operations

        Reason: AccountOperation is responsible for doing operation for account like
            add account, update account, get account. However, deposit is something called
            as transaction operation which eventually not responsible by account.
     */

    public void deposit(int amount, int accountNumber){
        // Move this to a different class
    }
}
