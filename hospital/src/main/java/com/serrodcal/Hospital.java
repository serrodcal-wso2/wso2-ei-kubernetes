package com.serrodcal;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Hospital {

    String id;
    String name;
    String address;
    String postalCode;
    String city;

    public Hospital(String id, String name, String address, String postalCode, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

}
