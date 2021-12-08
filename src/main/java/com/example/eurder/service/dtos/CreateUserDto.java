package com.example.eurder.service.dtos;

import com.example.eurder.domain.address.Address;
import com.example.eurder.domain.emailAddress.EmailAddress;

public class CreateUserDto {

    private String firstname;
    private String lastname;
    private EmailAddress emailAddress;
    private Address address;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CreateUserDto{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", emailAddress=" + emailAddress +
                ", address=" + address +
                '}';
    }
}
