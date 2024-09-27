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

    public int getBalance() throws BankingException {
        if (!this.isLocked) {
            return this.balance;
        } else {
            throw new BankingException();
        }
    }
}
