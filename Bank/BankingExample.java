/**
 * requirements:
 * need a class to represent a bank account, which has the following methods:
 * 1. credit(int amount) - add money to the account
 * 2. debit(int amount) - remove money from the account
 * 3. lockAccount() - lock the account
 * 4. byeAccount() - bye the account
 * 5. getBalance() - get the balance of the account
**/


package Bank;

public class BankingExample {
    private int balance;
    private boolean isLocked = false;

    public BankingExample() {
        balance = 0;
    }

    public void credit(final int amount) {
        this.balance += amount;
    }

    public void debit(final int amount) {
        this.balance -= amount;
    }

    public void lockAccount() {
        this.isLocked = true;
    }

    public void byeAccount() {
        this.isLocked = true;
    }

    public int getBalance() throws BankingException {
        if (!this.isLocked) {
            return this.balance;
        } else {
            throw new BankingException();
        }
    }
}
