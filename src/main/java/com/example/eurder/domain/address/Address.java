package com.example.eurder.domain.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Objects;

@JsonDeserialize(builder = Address.AddressBuilder.class)
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

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "with")
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

        public AddressBuilder withStreetName(@JsonProperty("streetName") String streetName) {
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder withStreetNumber(@JsonProperty("streetNumber") String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public AddressBuilder withPostCode(@JsonProperty("postCode") String postCode) {
            this.postCode = postCode;
            return this;
        }

        public AddressBuilder withCity(@JsonProperty("city") String city) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetName, address.streetName) && Objects.equals(streetNumber, address.streetNumber) && Objects.equals(postCode, address.postCode) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, streetNumber, postCode, city);
    }
}
