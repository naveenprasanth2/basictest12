package org.example.practise;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Lunnnnia990@";

//        boolean isValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#%&*,.;:']).{8,}$");

        boolean isValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#%&*,.<>/?\";:}{)]).{8,}$");

        System.out.println(isValid);
    }
}
