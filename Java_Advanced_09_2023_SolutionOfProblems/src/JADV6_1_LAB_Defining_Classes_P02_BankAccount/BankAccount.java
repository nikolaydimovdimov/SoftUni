package JADV6_1_LAB_Defining_Classes_P02_BankAccount;

public class BankAccount {

    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static int accountsCounter = 1;
    private static double interestRate = DEFAULT_INTEREST_RATE;


    private int id;
    private double balance;

    public BankAccount() {
        this.id = BankAccount.accountsCounter;
        BankAccount.accountsCounter++;
        this.balance = 0;
    }
    public int getId() {
        return id;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public static void setInterestRate(double rate) {
        BankAccount.interestRate = rate;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

}
