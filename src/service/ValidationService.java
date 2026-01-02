package service;

import java.util.Scanner;

public class ValidationService {

    public static final Scanner input = new Scanner(System.in);

    public static String getValidString(String prompt){
        while (true){
            System.out.println(prompt); // متنی که به کاربر نشون میده تا درخواست ورودی مورد نظر رو انجام بده
            String text = input.nextLine();
            if ((text.trim().isEmpty())){ // معادل با isBlank() //
                System.out.println("Vorodi nabayad khali bashad !");
            }
            return text.trim();
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
            String text = getValidString(prompt);
            if (text.matches("[0-9]+")){ // معادل با //d //
                return text;
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

    public static String formatName(String name){
        name = name.trim();
        if (name == null || name.isEmpty()) return name;
        name = name.toLowerCase();
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}