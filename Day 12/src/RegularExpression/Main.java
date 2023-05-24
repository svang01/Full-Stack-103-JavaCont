package RegularExpression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Email();
        PhoneNumber();
        Date();
        Url();
        CreditCardNumber();
        ZipCode();
        Identifier();
        HexCode();
        Time();
    }

    public static void Email() {
        String text = "shattv@yahoo.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " Is a valid email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void PhoneNumber() {
        String text = "(910) 111-7890";
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " is a valid phone number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }

    public static void Date() {
        String text = "05/23/2023";
        String regex = "^((0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|3[01])/((19|20)\\d\\d))$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " is a valid date");
        } else {
            System.out.println("Invalid Date");
        }
    }

    public static void Url() {
        String text = "http://www.yahoo.com";
        String regex = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " is a valid URL");
        } else {
            System.out.println("Invalid URL");
        }
    }

    public static void CreditCardNumber() {
        String text = "1234 1111 2222 4444";
        String regex = "^\\d{4}[- ]?\\d{4}[- ]?\\d{4}[- ]?\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text +" credit card number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }

    public static void ZipCode() {
        String text = "12345-6789";
        String regex = "^\\d{5}(-\\d{4})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " is valid a ZIP Code");
        } else {
            System.out.println("Invalid ZIP Code");
        }
    }

    public static void Identifier() {
        String text = "_validIdentifier178";
        String regex = "^[a-zA-Z_$][a-zA-Z_$0-9]*$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " is valid a identifier");
        } else {
            System.out.println("Invalid Identifier");
        }
    }

    public static void HexCode() {
        String text = "#FFAABB";
        String regex = "^#([A-Fa-f0-9]{6})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + "is valid a hex code");
        } else {
            System.out.println("Invalid Hex Code");
        }
    }

    public static void Time() {
        String text = "12:30";
        String regex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            System.out.println(text + " is a valid time");
        } else {
            System.out.println("Invalid Time");;
        }
    }
}

