import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts; 

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {
        if (acct != null) {
            accounts.add(acct);
        }
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    public Account getAccountByAccNumber(int accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccNumber() == accNumber) return acc;
        }
        return null;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}
