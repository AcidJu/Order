package com.example.eurder.domain.user;

import com.example.eurder.domain.address.Address;
import com.example.eurder.domain.emailAddress.EmailAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class UserTest {

    Address address;

    @BeforeEach
    public void init() {
        address = Address.AddressBuilder.addressBuilder()
                .withCity("Rixensart")
                .withPostCode("1330")
                .withStreetName("Avenue Alexandre")
                .withStreetNumber("2")
                .build();
    }

    @Test
    public void builderTest() {
        //Given
        User user = User.UserBuilder.userBuilder()
                .withId()
                .withAddress(address)
                .withEmailAddress(new EmailAddress("julian", "gmail.com"))
                .withLastname("Masoin")
                .withFirstname("Julian")
                .withPhoneNumber("+32479525650")
                .withRole(User.Role.CUSTOMER)
                .withPassword("123456")
                .build();

        Address addressExpected = Address.AddressBuilder.addressBuilder()
                .withCity("Rixensart")
                .withPostCode("1330")
                .withStreetName("Avenue Alexandre")
                .withStreetNumber("2")
                .build();

        //Then
        Assertions.assertEquals(UUID.class, user.getId().getClass());
        Assertions.assertEquals(addressExpected, user.getAddress());
        Assertions.assertEquals(new EmailAddress("julian", "gmail.com"), user.getEmailAddress());
        Assertions.assertEquals("Julian", user.getFirstname());
        Assertions.assertEquals("Masoin", user.getLastname());
        Assertions.assertEquals("+32479525650", user.getPhoneNumber());
        Assertions.assertEquals("123456", user.getPassword());
        Assertions.assertEquals(User.Role.CUSTOMER, user.getRole());

    }

}