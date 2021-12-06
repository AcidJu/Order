package com.example.eurder.domain.emailAddress;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {

    private final String username;
    private final String domain;
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public EmailAddress(String username, String domain) {
        if(!isValidEmail(username + "@" + domain)) { throw new IllegalArgumentException("This email address is not valid!");
        }
        this.username = username;
        this.domain = domain;
    }

    @Override
    public String toString() {
        return username + "@" + domain;
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
