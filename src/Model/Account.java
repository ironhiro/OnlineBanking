package Model;
import java.util.*;

public abstract class Account {

    public Account() {
    }

    private int accountNo;

    private int balance;

    private int accountType;

    public int getAccountNo() {
        // TODO implement here
        return accountNo;
    }

    public int getBalance() {
        // TODO implement here
        return balance;
    }

    public int getAccountType() {
        // TODO implement here
        return accountType;
    }

    public void setBalance(int amount) {
        // TODO implement here
    	balance = amount;
        
    }

}