import Bank.BankingExample;

public class Main {
    public static void main(String[] args) {
        BankingExample bank = new BankingExample();
        try {
            bank.lockAccount();
            System.out.println(bank.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}