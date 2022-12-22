package com.dummytesting;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z]{3,}[.+-][a-zA-Z0-9]*[@][a-zA-Z]+[.][a-z]{3,}([_+-.][a-zA-Z])*$";
    private static final String MOBILE_NUMBER_PATTERN = "^[+91|0]+[ ]?[6-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^((?=.*[A-Z]))[a-zA-Z0-9]{8,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mobNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobNumber).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}