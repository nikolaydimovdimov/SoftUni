package bank.entities.client;

public abstract class BaseClient implements Client{
    private String	name;
    private String	ID;
    private int	interest;
    private double income;
    private static final int INCREASE_INTEREST=0;

    public BaseClient(String name, String ID, int interest, double income) {
        this.setName(name);
        this.setID(ID);
        this.setInterest(interest);
        this.setIncome(income);
    }

    @Override
    public void setName(String name) {
        if (name==null||name.trim().isEmpty()) {
            throw new IllegalArgumentException("Client name cannot be null or empty.");
        }
        this.name=name;
    }

    private void setID(String ID) {
        if (ID==null||ID.trim().isEmpty()) {
            throw new IllegalArgumentException("Client’s ID cannot be null or empty.");
        }
        
        this.ID = ID;
    }

    protected void setInterest(int interest) {
        this.interest = interest;
    }

    private void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getInterest() {
        return this.interest;
    }

    @Override
    public double getIncome() {
        return this.income;
    }



}
