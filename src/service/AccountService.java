//package service;

import model.Account;
import model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private static List<Account> accounts = new ArrayList<>();


    public static Account createAccount(Customer c){

        String accNumber = IdGeneratorService.generateAccountNumber(c.getNationalId());

        Account a = new Account(accNumber, LocalDate.now().toString(), 0);

        c.addAccount(a);
        accounts.add(a);

        return a;
    }


    public static Account findAccount(String number){

        for(Account a : accounts)
            if(a.getAccountNumber().equals(number))
                return a;

        return null;
    }


    public static List<Account> getAccounts(){
        return accounts;
    }
}
