package com.example.eurder.domain.address;

public class Address {

    private String streetName;
    private String streetNumber;
    private String postCode;
    private String city;

    public Address(AddressBuilder builder) {
        streetName = builder.streetName;
        streetNumber = builder.streetNumber;
        postCode = builder.postCode;
        city = builder.city;
    }

    public static final class AddressBuilder {
        private String streetName;
        private String streetNumber;
        private String postCode;
        private String city;

        private AddressBuilder() {
        }

        public Address build() {
            return new Address(this);
        }

        public static AddressBuilder addressBuilder() {
            return new AddressBuilder();
        }

        public AddressBuilder withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder withStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public AddressBuilder withPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public AddressBuilder withCity(String city) {
            this.city = city;
            return this;
        }

    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }
}
