package com.example.eurder.repository;

import com.example.eurder.domain.emailAddress.EmailAddress;
import com.example.eurder.domain.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserRepositoryTest {

    User user;

    @BeforeEach
    void init() {
        user = User.UserBuilder.userBuilder()
                .withPhoneNumber("+32479525650")
                .withFirstname("Julian")
                .withLastname("Masoin")
                .withEmailAddress(new EmailAddress("julian", "gmail.com"))
                .withAddress(null)
                .build();
    }

    @Test
    void getUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.save(user);

        Assertions.assertTrue(userRepository.getAllUser().contains(user));
    }


}