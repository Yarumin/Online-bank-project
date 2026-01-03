package service;

import model.Customer;
import model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ReportService {


    public static List<Transaction> getDailyTransactions(Customer c, String date){

        List<Transaction> result = new ArrayList<>();

        for(Transaction t : c.getTransactions()){
            if(t.getDate().equals(date)){
                result.add(t);
            }
        }

        return result;
    }


    public static List<Transaction> getAll(Customer c){
        return c.getTransactions();
    }
}

