package bank.repositories;

import bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;

public class LoanRepository implements Repository{
    private Collection<Loan> loans;

    public LoanRepository() {
        loans=new ArrayList<>();
    }

    public void addLoan(Loan loan){
        this.loans.add(loan);
    }

    public boolean removeLoan(Loan loan){
        return this.loans.remove(loan);
    }
    public Loan findFirst(String type){
        return this.loans.stream()
                .filter(loan -> loan.getClass().getSimpleName().equals(type))
                .findFirst()
                .orElse(null);
    }
}
