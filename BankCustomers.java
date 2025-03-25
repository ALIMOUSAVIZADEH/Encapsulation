import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<TheBankAccount> accountsList = new ArrayList<>();

    public void addAccount(TheBankAccount account) {
        accountsList.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void showAllBalances() {
        for (TheBankAccount account : accountsList) {
            System.out.println("Account: " + account.getAccountNumber() +
                    ", Holder: " + account.getAccountHolderName() +
                    ", Balance: " + account.getBalance());
        }
    }

    public TheBankAccount findAccount(String accountNumber) {
        for (TheBankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account found: " + account.getAccountHolderName());
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}