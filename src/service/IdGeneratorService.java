import java.time.LocalDate;

public class IdGeneratorService {

    public static String generateEmployeeId(String nationalId) {
        String last5 = nationalId != null && nationalId.length() >= 5 ? nationalId.substring(nationalId.length()-5) : nationalId;
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int lastTwoDigits = year % 100;
        return "415" + (last5 == null ? "" : last5) + lastTwoDigits;
    }

    public static String generateAccountNumber(String nationalId) {
        LocalDate d = LocalDate.now();
        String dd = String.format("%02d", d.getDayOfMonth());
        String mm = String.format("%02d", d.getMonthValue());
        String yy = String.valueOf(d.getYear()).substring(2);
        String last6 = nationalId != null && nationalId.length() >= 6 ? nationalId.substring(nationalId.length()-6) : nationalId;
        return "4895" + (last6 == null ? "" : last6) + dd + mm + yy;
    }
}

