package com.example.eurder.domain.address;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressTest {

    @Test
    void creatingAnAddressFromBuilder() {
        Address address = Address.AddressBuilder.addressBuilder()
                .withStreetNumber("2")
                .withStreetName("Avenue Alexandre")
                .withPostCode("1330")
                .withCity("Rixensart")
                .build();

        Assertions.assertEquals("Rixensart", address.getCity());
        Assertions.assertEquals("2", address.getStreetNumber());
        Assertions.assertEquals("Avenue Alexandre", address.getStreetName());
        Assertions.assertEquals("1330", address.getPostCode());
    }

}