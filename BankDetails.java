package BMS;

import java.util.ArrayList;

public class BankDetails {
    public static final String BANK_NAME = "SBI";
    public static final String BRANCH_NAME = "India";
    public static final String IFSC = "SBI001";
    public static int numberOfAccounts;
    public static ArrayList<BankUser> accountList;
    public static final int INTEREST = 5;
    public static int bankBalance;

    public BankDetails() {
        BankDetails.numberOfAccounts = 0;
        BankDetails.accountList = new ArrayList<BankUser>();
        BankDetails.bankBalance = 1000000;
    }
}
