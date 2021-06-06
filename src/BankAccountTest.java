import com.bankaccount.BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount jim = new BankAccount();
        BankAccount ryan = new BankAccount(150, 200);

        jim.showAccountInfo();
        ryan.showAccountInfo();
        System.out.println("Total Number of accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total Money: " + BankAccount.getTotalMoney());

        System.out.println("\nDepositing Money!\n");

        jim.depositToCheckings(200.11);
        jim.depositToSavings(300.90);
        ryan.depositToCheckings(49.39);
        ryan.depositToSavings(29.39);

        jim.showAccountInfo();
        ryan.showAccountInfo();
        System.out.println("Total Money: " + BankAccount.getTotalMoney());

        System.out.println("\nWithdrawing Money!\n");

        jim.withdrawalFromCheckings(20);
        jim.withdrawalFromSavings(90.20);
        ryan.withdrawalFromCheckings(1.00);
        ryan.withdrawalFromSavings(29.29);

        jim.showAccountInfo();
        ryan.showAccountInfo();
        System.out.println("Total Money: " + BankAccount.getTotalMoney());


    }

}
