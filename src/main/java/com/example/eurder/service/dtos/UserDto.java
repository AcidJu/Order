package com.example.eurder.service.dtos;

import com.example.eurder.domain.address.Address;
import com.example.eurder.domain.emailAddress.EmailAddress;

import java.util.UUID;

public class UserDto {

    private UUID id;
    private String firstname;
    private String lastname;
    private EmailAddress emailAddress;
    private Address address;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserDto setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserDto setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public UserDto setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public UserDto setAddress(Address address) {
        this.address = address;
        return this;
    }
}
