package bank.core;

import bank.entities.bank.Bank;
import bank.entities.bank.BranchBank;
import bank.entities.bank.CentralBank;
import bank.entities.client.Adult;
import bank.entities.client.Client;
import bank.entities.client.Student;
import bank.entities.loan.Loan;
import bank.entities.loan.MortgageLoan;
import bank.entities.loan.StudentLoan;
import bank.repositories.LoanRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private LoanRepository loans;
    private Collection<Bank> banks;

    public ControllerImpl() {
        this.banks = new ArrayList<>();
        this.loans = new LoanRepository();
    }

    public String addBank(String type, String name) {
        Bank newBank;
        switch (type) {
            case "CentralBank":
                newBank = new CentralBank(name);
                break;
            case "BranchBank":
                newBank = new BranchBank(name);
                break;
            default:
                throw new IllegalArgumentException("Invalid bank type.");
        }
        this.banks.add(newBank);
        return String.format("%s is successfully added.", type);
    }

    public String addLoan(String type) {
        Loan newLoan;
        switch (type) {
            case "StudentLoan":
                newLoan = new StudentLoan();
                break;
            case "MortgageLoan":
                newLoan = new MortgageLoan();
                break;
            default:
                throw new IllegalArgumentException("Invalid loan type.");
        }
        this.loans.addLoan(newLoan);
        return String.format("%s is successfully added.", type);
    }

    public String returnedLoan(String bankName, String loanType) {
        Loan returnedLoan = this.loans.findFirst(loanType);
        if (returnedLoan == null) {
            throw new IllegalArgumentException(String.format("Loan of type %s is missing.", loanType));
        }
        for (Bank bank : this.banks) {
            if (bank.getName().equals(bankName)) {
                bank.addLoan(returnedLoan);
                break;
            }
        }
        this.loans.removeLoan(returnedLoan);
        return String.format("%s successfully added to %s.", loanType, bankName);
    }

    public String addClient(String bankName, String clientType, String clientName, String ID, double income) {
        Client newClient;
        switch (clientType) {
            case "Student":
                newClient = new Student(clientName, ID, income);
                break;
            case "Adult":
                newClient = new Adult(clientName, ID, income);
                break;
            default:
                throw new IllegalArgumentException("Invalid client type.");
        }
        String output;
        Bank neededBank = isClientTypeValidForBank(bankName, clientType);
        if (neededBank == null) {
            output = "Unsuitable bank.";
        } else {
            neededBank.addClient(newClient);
            output = String.format("%s successfully added to %s.", clientType, bankName);
        }
        return output;
    }

    private Bank isClientTypeValidForBank(String bankName, String clientType) {
        Bank neededBank = null;

        for (Bank bank : this.banks) {
            if (bank.getName().equals(bankName)) {
                neededBank = bank;
                break;
            }
        }
        String neededBankType = neededBank.getClass().getSimpleName();
        if (clientType.equals("Adult") && neededBankType.equals("CentralBank") ||
                clientType.equals("Student") && neededBankType.equals("BranchBank")) {
            return neededBank;
        }
        return null;

    }

    public String finalCalculation(String bankName) {
        double incomes = 0;
        double amounts = 0;

        for (Bank bank : this.banks) {
            if (bank.getName().equals(bankName)) {
                incomes = bank.getClients().stream().mapToDouble(Client::getIncome).sum();
                amounts = bank.getLoans().stream().mapToDouble(Loan::getAmount).sum();
            }
        }

        return String.format("The funds of bank %s is %.2f.", bankName, incomes + amounts);
    }

    public String getStatistics() {

        return this.banks.stream()
                .map(Bank::getStatistics)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}



