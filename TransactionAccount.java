public class TransactionAccount extends TheBankAccount {
    private static final double OVERDRAFT_LIMIT = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + OVERDRAFT_LIMIT) {
            if (amount > getBalance()) {
                System.out.println("Overdraft used for withdrawal.");
            }
            balance -= amount;
            System.out.println(amount + " withdrawn from TransactionAccount " + getAccountNumber());
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for TransactionAccount.");
    }
}