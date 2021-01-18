package assignments_java10;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Account> accounts = Account.createAccounts(5);
        for(Account ac : accounts) {
            System.out.println(ac.getId());
        }


    }
}
