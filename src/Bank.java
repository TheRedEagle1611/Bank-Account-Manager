import java.util.HashMap;

public class Bank {
    private HashMap<String, BankAccount> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, BankAccount account) {
        accounts.put(accountNumber, account);
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
