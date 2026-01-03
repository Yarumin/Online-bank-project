package service;

import java.time.LocalDate;
import java.util.Random;

public class IdGeneratorService {

    public static String generateEmployeeId(String nationalId){
        LocalDate now = LocalDate.now();
        String year = String.valueOf(now.getYear()).substring(2);
        String lastFive = nationalId.substring(5);
        return year + lastFive + "415";
    }


    public static String generateAccountNumber(String nationalId){
        LocalDate now = LocalDate.now();

        String day = String.valueOf(now.getDayOfMonth());
        if (day.length() == 1) day = "0" + day;

        String month = String.valueOf(now.getMonthValue());
        if (month.length() == 1) month = "0" + month;

        String year = String.valueOf(now.getYear()).substring(2);

        String lastSix = nationalId.substring(4);

        return day + month + year + lastSix;
    }


    public static String generateReportId(){
        Random r = new Random();
        return "R" + (100000 + r.nextInt(900000));
    }
}