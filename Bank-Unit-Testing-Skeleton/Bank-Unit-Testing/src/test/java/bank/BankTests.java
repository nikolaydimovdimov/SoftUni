package bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class BankTests {
    private final static String BANK_NAME = "Bank Name";
    private final static String CLIENT_NAME = "Client Name";

    private final static int CAPACITY = 5;

    Bank bank;
    Client client;

    @Before
    public void arrange_Bank() {
        this.bank = new Bank(BANK_NAME, CAPACITY);
        this.client = new Client(CLIENT_NAME);
    }

    @Test
    public void test_Constructor_Capacity() {
        Assert.assertEquals(CAPACITY, this.bank.getCapacity());
    }

    @Test
    public void test_Constructor_BankName() {
        Assert.assertEquals(BANK_NAME, this.bank.getName());
    }

    @Test(expected = NullPointerException.class)
    public void test_setName_NULL() {
        Bank newBank = new Bank(null, CAPACITY);
    }

    @Test(expected = NullPointerException.class)
    public void test_setName_Empty() {
        Bank newBank = new Bank(" ", CAPACITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_setCapacity_Negative() {
        Bank newBank = new Bank(BANK_NAME, -1);
    }

    @Test
    public void test_addClient_and_getCount() {
        this.bank.addClient(client);
        Assert.assertEquals(1, this.bank.getCount());
        this.bank.addClient(client);
        Assert.assertEquals(2, this.bank.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_addClient_over_Capacity() {
        while (this.bank.getCount() <= CAPACITY) {
            this.bank.addClient(client);
        }
        this.bank.addClient(client);
    }

    @Test
    public void test_removeClient() {
        this.bank.addClient(client);
        Assert.assertEquals(1, this.bank.getCount());
        this.bank.removeClient(client.getName());
        Assert.assertEquals(0, this.bank.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_removeClient_when_NotExist_Client() {
        this.bank.addClient(client);
        Assert.assertEquals(1, this.bank.getCount());
        this.bank.removeClient("XXX");
    }

    @Test
    public void test_loanWithdrawal() {
        this.bank.addClient(client);
        this.bank.loanWithdrawal(client.getName());
        Assert.assertEquals(false, client.isApprovedForLoan());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_loanWithdrawal_when_NotExist_Client() {
        this.bank.addClient(client);
        this.bank.loanWithdrawal("XXX");
    }
    @Test
    public void test_statistics(){
       Assert.assertEquals("The client  is at the Bank Name bank!", this.bank.statistics());
        this.bank.addClient(client);
       Assert.assertEquals("The client Client Name is at the Bank Name bank!", this.bank.statistics());
        this.bank.addClient(client);
       Assert.assertEquals("The client Client Name, Client Name is at the Bank Name bank!", this.bank.statistics());
    }

}
