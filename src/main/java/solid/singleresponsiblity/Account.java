package solid.singleresponsiblity;

import java.math.BigDecimal;

public class Account {
    private int accountNumber;
    private String firstName;
    private BigDecimal totalAmount;

    Account(int accountNumber, String firstName, BigDecimal totalAmount) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.totalAmount = totalAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
