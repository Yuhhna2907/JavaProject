package PhoneNumberValidator;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String number) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return number.matches(regex);
    }
}
