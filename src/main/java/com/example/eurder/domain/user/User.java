package com.example.eurder.domain.user;

import com.example.eurder.domain.address.Address;
import com.example.eurder.domain.emailAddress.EmailAddress;

import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstname;
    private String lastname;
    private EmailAddress emailAddress;
    private Address address;
    private String phoneNumber;

    public User(UserBuilder builder) {
        id = UUID.randomUUID();
        firstname = builder.firstname;
        lastname = builder.lastname;
        emailAddress = builder.emailAddress;
        address = builder.address;
        phoneNumber = builder.phoneNumber;
    }

    public static final class UserBuilder {
        private UUID id;
        private String firstname;
        private String lastname;
        private EmailAddress emailAddress;
        private Address address;
        private String phoneNumber;

        private UserBuilder() {
        }

        public User build() {
            return new User(this);
        }

        public static UserBuilder userBuilder() {
            return new UserBuilder();
        }

        public UserBuilder withId(UUID id) {
            this.id = id;
            return this;
        }

        public UserBuilder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder withEmailAddress(EmailAddress emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public UserBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

    }

    public UUID getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", emailAddress=" + emailAddress +
                ", address=" + address +
                '}';
    }
}
