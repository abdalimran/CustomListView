package com.github.abdalimran.customlistview;

public class Profile {
    private String name="Name: ";
    private String address="Address: ";
    private String email="Email: ";
    private int propic;


    public Profile(String name, String address, String email, int propic) {
        this.name += name;
        this.address += address;
        this.email += email;
        this.propic = propic;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPropic() {
        return propic;
    }

    public void setPropic(int propic) {
        this.propic = propic;
    }
}