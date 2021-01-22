public class PasswordValidation {


    public static boolean validatePassword(String password) {
        return password.length() > 8;
    }

    public static boolean isThereNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                return true;
            }

        }
        return false;
    }

    public static boolean isThereSmallBigLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                return true;

            }
        }
        return false;
    }

    public static boolean isThereSmallBigLetter2(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                return true;

            }
        }
        return false;
    }
}