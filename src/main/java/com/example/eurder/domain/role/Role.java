package com.example.eurder.domain.role;

import com.example.eurder.domain.feature.Feature;

import java.util.*;

public enum Role {
    ADMIN(List.of(Feature.ADD_ITEM, Feature.VIEW_CUSTOMERS, Feature.VIEW_CUSTOMER_DETAIL)),
    CUSTOMER(List.of(Feature.ORDER_ITEMS));

    private List<Feature> featureList;

    Role(List<Feature> featureList) {
        this.featureList = featureList;
    }
}
