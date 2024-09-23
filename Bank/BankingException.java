package Bank;

public class BankingException extends Exception {
    public BankingException() {
        super("Account is locked");
    }
}
