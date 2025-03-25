public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        TheBankAccount saving1 = new SavingAccount("12345", "Ali", 1000);
        TheBankAccount saving2 = new SavingAccount("67890", "Reza", 2000);
        TheBankAccount saving3 = new SavingAccount("11223", "Sara", 1500);
        TheBankAccount transaction1 = new TransactionAccount("33445", "Maryam", 500);
        TheBankAccount transaction2 = new TransactionAccount("55667", "Hossein", 300);
        TheBankAccount transaction3 = new TransactionAccount("77889", "Nima", 700);

        bank.addAccount(saving1);
        bank.addAccount(saving2);
        bank.addAccount(saving3);
        bank.addAccount(transaction1);
        bank.addAccount(transaction2);
        bank.addAccount(transaction3);

        bank.findAccount("12345");
        bank.findAccount("99999");

        saving1.deposit(500);
        System.out.println("Balance after deposit: " + saving1.getBalance());
        saving1.deposit(-100);
        transaction1.withdraw(100);
        transaction1.withdraw(1200);

        saving1.calculateInterest();
        transaction1.calculateInterest();

        bank.showAllBalances();
    }
}