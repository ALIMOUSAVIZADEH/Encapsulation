public class SavingAccount extends TheBankAccount {
    private static final double INTEREST_RATE = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
        System.out.println("Interest of " + interest + " added to SavingAccount.");
    }
}