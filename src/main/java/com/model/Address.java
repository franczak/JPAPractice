package com.model;

import javax.persistence.*;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(){}

    public String getCity() { return city; }

    public String getStreet() { return street; }

    public String getZipCode() { return zipCode; }

    public void setCity(String city) { this.city = city; }

    public void setStreet(String street) { this.street = street; }

    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}
