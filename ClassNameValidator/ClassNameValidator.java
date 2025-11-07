package ClassNameValidator;


public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }
}
