package com.company;

public class Address {
    String city;
    String street, state;

    Address(String city, String street, String state)
    {
        this.city = city;
        this.street = street;
        this.state = state;
    }

    public String getAddressDetails()
    {
         return city + street + state ;
    }
    public void updateAddressDetails(String addressDetails)
    {

    }



}
