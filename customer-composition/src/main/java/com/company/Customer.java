package com.company;

public class Customer {
    public static void main(String[] args) {

        CustomerAccount bob = new CustomerAccount("Bob", "Smith", true);

        bob.setEmail("bob@gmail.com");
        Address x = new Address();
        x.setStreet("123 Main Street");
        x.setCity("Charlotte");
        x.setState("NC");
        x.setZipcode("29202");
        bob.setBillingAddress(x);
        bob.setShippingAddress(x);

        String customer = "Name: " + bob.getFirstName() + " " + bob.getLastName();
        customer += "\nEmail: " + bob.getEmail();
        customer += "\nRewards Member: " + bob.getRewardsMember();
        customer += "\nAddress: " + bob.getBillingAddress().getStreet() +
                " "+ bob.getBillingAddress().getCity()+
                " "+ bob.getBillingAddress().getState()+
                " "+ bob.getBillingAddress().getZipcode();

        System.out.println(customer);

    }
}
