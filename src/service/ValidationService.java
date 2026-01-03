//package service;

import java.util.Scanner;

public class ValidationService {

    public static final Scanner input = new Scanner(System.in);

    public static String getValidString(String prompt){
        while (true){
            System.out.println(prompt); // متنی که به کاربر نشون میده تا درخواست ورودی مورد نظر رو انجام بده
            String text = input.nextLine();
            if (!(text.trim().isEmpty())){ // معادل با isBlank() //
                return text.trim();
            }
            System.out.println("Vorodi nabayad khali bashad !");
        }
    }

    /* public static double getValidDouble(String prompt){
        while (true) {
            System.out.println(prompt);
            try {
                double value = input.nextDouble();
                input.nextLine(); // خالی کردن بافر
                return value;
            } catch (Exception e) { // InputMismatchException
                System.out.println("Vorodi bayad yek adade motabar bashad !");
                input.nextLine(); // دور ریختن ورودی خراب
            }
        }
    } */


    public static double getValidDouble(String prompt){
        while (true) {
            String number = getValidString(prompt);
            try {
                return Double.parseDouble(number);
            } catch (NumberFormatException e) {
                System.out.println("Vorodi bayad yek adade motabar bashad !");
            }
        }
    }

    public static double getWithdrawAmount(String prompt, double balance) {
        while (true) {
            double amount = getValidDouble(prompt);

            if (amount <= 0){
                System.out.println("Mablagh bayad bozorgtar az sefr bashad !");
                continue;
            }

            if (amount > balance){
                System.out.println("Mojodi kafi nist ! Mojodi shoma: " + balance);
                continue;
            }

        return amount;
        }
    }

    public static String isEnglishLetters(String prompt){
        while (true) {
            String text = getValidString(prompt);
            if (text.matches("[a-zA-Z]+")){
                return text;
            }
            System.out.println("Vorodi Bayad yek matne englisi bashad !");
        }
    }

    public static String isNumeric(String prompt){
        while (true) {
            String value = getValidString(prompt);
            if (value.matches("[0-9]+")){ // معادل با //d //
                return value;
            }
            System.out.println("Vorodi Bayad yek adade englisi bashad !");
        }
    }

    public static String isValidNationalId(String prompt){
        while (true) {
            String id = isNumeric(prompt);
            if (id.length() == 10){
                return id;
            }
            System.out.println("Kode meli bayad 10 ragham bashad !");
        }
    }

    public static String isValidPostalCode(String prompt){
        while (true) {
            String code = isNumeric(prompt);
            if (code.length() == 10){
                return code;
            }
            System.out.println("Kode posti bayad 10 ragham bashad !");
        }
    }

    public static String isValidPhoneNumber(String prompt){
        while (true) {
            String phone = isNumeric(prompt);
            if ((phone.length() == 11) && phone.startsWith("09")){
                return phone;
            }
            System.out.println("Shomare mobile bayad 11 ragham va motabar bashad !");
        }
    }

    public static String isValidEmail(String prompt){
        while (true) {
            String email = getValidString(prompt);
            if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")){ // تا حدودی طبق RFC جهانی
                return email;
            }
            System.out.println("Email bayad motabar bashad !");
        }
    }

    public static String isValidAddress(String prompt){
        while (true) {
            String address = getValidString(prompt);
            if (address.length() <= 250){
                return address;
            }
            System.out.println("Adres bayad zire 250 karackter bashad !");
        }
    }

    public static String normalizeName(String name){
        if (name == null || name.trim().isEmpty()) return name;
        name = name.trim().toLowerCase();
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}