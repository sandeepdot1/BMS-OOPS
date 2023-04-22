package BMS;

public class Main {
    public static void main(String[] args) {
        BankDetails sbi = new BankDetails();
        BankUser john = new BankUser("Sandeep", 22);
        DemoUser alan = new DemoUser("Vijay", 22);
        john.showUserDetails();
        //alan.showUserDetails();

        System.out.println();

        // services
        john.creditAmount(10000);
        john.debitAmount(2000);
        john.applyLoan(10000000);
        john.depositAmt(5000);
        System.out.println();
        john.showUserDetails();
        System.out.println();

        //delete account
        john.deleteAccount();

        System.out.println();
        john.showUserDetails();
    }
}
