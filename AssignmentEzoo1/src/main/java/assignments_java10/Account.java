package assignments_java10;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private long id;
    private String accountType;

    public Account(long id, String accountType) {
        this.id = id;
        this.accountType = accountType;
    }

    public static List<Account> createAccounts(int numAccounts) {

        List<Account> listOfAccounts = new ArrayList<>();
        for (int i = 0; i < numAccounts; i++) {
            Account acc = new Account(i, "checkings");
            listOfAccounts.add(acc);
        }
        return listOfAccounts;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
