package com.example.eurder.service.dtos;

import com.example.eurder.domain.address.Address;
import com.example.eurder.domain.emailAddress.EmailAddress;
import com.example.eurder.domain.role.Role;

public class CreateUserDto {

    private String firstname;
    private String lastname;
    private EmailAddress emailAddress;
    private Address address;
    private Role role;
    private String phoneNumber;

    public String getFirstname() {
        return firstname;
    }

    public CreateUserDto setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public CreateUserDto setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public CreateUserDto setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public CreateUserDto setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public CreateUserDto setRole(Role role) {
        this.role = role;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CreateUserDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

