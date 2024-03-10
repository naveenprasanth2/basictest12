package org.example.practise;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "naveenprasanth8989@gmail.com";

//        boolean isValid = email.matches("^[a-zA-Z]+[0-9]*[a-zA-Z0-9]*@[a-zA-Z]+[.](com|in|orginfo)$");
        boolean isValid = email.matches("^[a-zA-Z]+[0-9]*[a-zA-Z0-9]*@[a-zA-Z]+[.][a-zA-Z]{2,}$");

        System.out.println(isValid);
    }
}
