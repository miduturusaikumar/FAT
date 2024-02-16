package com.backend.FAT_Backend.model;

import jakarta.persistence.*;

import java.lang.reflect.GenericArrayType;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private Integer address_id;
    @Column(name="address_line_1")
    private String address_Line_1;

    @Column(name="address_line_2")
    private String address_Line_2;

    @Column(name="pincode")
    private Integer pincode;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String Country;

    public Address(Integer address_id, String address_Line_1, String address_Line_2, Integer pincode, String city, String state, String country) {
        this.address_id = address_id;
        this.address_Line_1 = address_Line_1;
        this.address_Line_2 = address_Line_2;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.Country = country;
    }

    public Address() {

    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public String getAddress_Line_1() {
        return address_Line_1;
    }

    public void setAddress_Line_1(String address_Line_1) {
        this.address_Line_1 = address_Line_1;
    }

    public String getAddress_Line_2() {
        return address_Line_2;
    }

    public void setAddress_Line_2(String address_Line_2) {
        this.address_Line_2 = address_Line_2;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", address_Line_1='" + address_Line_1 + '\'' +
                ", address_Line_2='" + address_Line_2 + '\'' +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
