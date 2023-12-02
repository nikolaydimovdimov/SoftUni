package bank.entities.bank;

import bank.entities.client.Client;
import bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseBank implements Bank {
    private String name;
    private int capacity;
    private Collection<Loan> loans;
    private Collection<Client> clients;

    public BaseBank(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.loans=new ArrayList<>();
        this.clients=new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Collection<Client> getClients() {
        return this.clients;
    }

    @Override
    public Collection<Loan> getLoans() {
        return this.loans;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Bank name cannot be null or empty.");
        }

        this.name = name;
    }

    public int sumOfInterestRates() {
        return this.loans.stream()
                .mapToInt(Loan::getInterestRate)
                .sum();
    }

    public void addClient(Client client) {
        if (this.clients.size() == this.capacity) {
            throw new IllegalStateException("Not enough capacity for this client.");
        }
        this.clients.add(client);
    }
    public void removeClient(Client client){
        this.clients.remove(client);
    }
    public void addLoan(Loan loan){
        this.loans.add(loan);
    }
    public String getStatistics(){
        StringBuilder output=new StringBuilder();
        output.append(String.format("Name: %s, Type: %s\n",this.name,this.getClass().getSimpleName()));
        output.append("Clients: ");
        if (this.clients.isEmpty()) {
            output.append("none\n");
        }else {
            output.append(this.clients.stream().map(Client::getName).collect(Collectors.joining(", "))).append("\n");
        }
        output.append(String.format("Loans: %d, Sum of interest rates: %d",this.loans.size(),this.sumOfInterestRates()));
        return output.toString();
    }
}
