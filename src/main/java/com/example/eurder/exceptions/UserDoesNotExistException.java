package com.example.eurder.exceptions;

public class UserDoesNotExistException extends RuntimeException {
    public UserDoesNotExistException() {
        super("This user does not exist");
    }
}
