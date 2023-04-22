package BMS;

public class BankUser extends User{
    public String ifsc;
    private int accountNo;
    private int balance;

    public BankUser(String name, int age) {
        super(name, age);
        if (age < 18) {
            System.out.println("Can't create account for " + this.name);
            System.exit(0);
        }
        this.ifsc = BankDetails.IFSC;
        this.balance = 0;
        BankDetails.numberOfAccounts += 1;
        this.accountNo = BankDetails.numberOfAccounts;
        BankDetails.accountList.add(this);
    }

    public void creditAmount(int amount) {
        if(BankDetails.accountList.contains(this)) {
            this.balance += amount;
        }
    }

    public void debitAmount(int amount) {
        if(BankDetails.accountList.contains(this)) {
            if (this.balance >= amount) {
                this.balance -= amount;
            }
        }
    }

    public void depositAmt(int amount) {
        if(BankDetails.accountList.contains(this)) {
            if (this.balance >= amount) {
                this.balance -= amount;
                BankDetails.bankBalance += amount;
                System.out.println("Deposit Amount: " + amount);
            }
        }
    }

    public void applyLoan(int amount) {
        if(BankDetails.accountList.contains(this)) {
            int bankLimit = (int) (BankDetails.bankBalance * 0.1f);
            this.balance += Math.min(bankLimit, amount);
            BankDetails.bankBalance -= Math.min(bankLimit, amount);
            System.out.println("Loan given for amount: " + Math.min(bankLimit, amount));
        }
    }

    public void deleteAccount() {
        if(BankDetails.accountList.contains(this)) {
            BankDetails.accountList.remove(this);
            System.out.println("Account Number:" + this.accountNo + " Deleted");
        }
    }

    public void showUserDetails() {
        System.out.println("******Bank User******");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if(BankDetails.accountList.contains(this)) {
            System.out.println("Account Number: " + this.accountNo);
            System.out.println("Balance: " + this.balance);
        }
    }
}
