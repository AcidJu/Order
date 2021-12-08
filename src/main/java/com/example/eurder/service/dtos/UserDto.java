package com.example.eurder.service.dtos;

import com.example.eurder.domain.address.Address;
import com.example.eurder.domain.emailAddress.EmailAddress;
import com.example.eurder.domain.user.User;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize
public class UserDto {

    private UUID id;
    private String firstname;
    private String lastname;
    private EmailAddress emailAddress;
    private Address address;
    private String phoneNumber;

    public UUID getId() {
        return id;
    }

    public UserDto setId(UUID id) {
        this.id = id;
        return this;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
