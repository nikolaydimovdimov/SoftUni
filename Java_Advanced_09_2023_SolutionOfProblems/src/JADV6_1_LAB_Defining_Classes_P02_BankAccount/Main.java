package JADV6_1_LAB_Defining_Classes_P02_BankAccount;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<BankAccount> myBank = new HashSet<>();

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("End")) {
            switch (input[0]) {
                case "Create":
                    createAccount(myBank);
                    break;
                case "Deposit":
                    depositAmount(myBank, input);
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(input[1]));
                    break;
                case "GetInterest":
                    getInterestOfDeposit(myBank, input);
                    break;
            }

            input = scanner.nextLine().split("\\s+");
        }

    }

    private static void createAccount(Set<BankAccount> myBank) {
        BankAccount newAccount = new BankAccount();
        myBank.add(newAccount);
        System.out.printf("Account ID%d created%n", newAccount.getId());
    }

    private static void depositAmount(Set<BankAccount> myBank, String[] input) {
        int id = Integer.parseInt(input[1]);
        double amount = Double.parseDouble(input[2]);
        BankAccount currentAccount = new BankAccount();
        currentAccount = getAccount(myBank, id);
        if (currentAccount != null) {
            currentAccount.deposit(amount);
            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
        }
    }

    private static void getInterestOfDeposit(Set<BankAccount> myBank, String[] input) {
        int id = Integer.parseInt(input[1]);
        int years = Integer.parseInt(input[2]);
        BankAccount currentAccount = new BankAccount();
        currentAccount = getAccount(myBank, id);
        if (currentAccount != null) {
            System.out.printf("%.02f%n", currentAccount.getInterest(years));
        }
    }

    private static BankAccount getAccount(Set<BankAccount> myBank, int id) {
        for (BankAccount bankAccount : myBank) {
            if (bankAccount.getId() == id) return bankAccount;
        }
        System.out.println("Account does not exist");
        return null;
    }
}
