package com.backend.FAT_Backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name="firstname",nullable = false)
    private String firstname;
    @Column(name="lastname",nullable = false)
    private String lastname;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="mobile_number",nullable = false)
    private Integer mobile_number;
    @Column(name="aadhar_number",nullable = false)
    private Integer aadhar_number;
    @Column(name="password",nullable = false)
    private String password;

    public Customer(Integer customer_id, Address address, String firstname, String lastname, String email, Integer mobile_number, Integer aadhar_number, String password) {
        this.customer_id = customer_id;
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile_number = mobile_number;
        this.aadhar_number = aadhar_number;
        this.password = password;
    }

    public Customer() {
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(Integer mobile_number) {
        this.mobile_number = mobile_number;
    }

    public Integer getAadhar_number() {
        return aadhar_number;
    }

    public void setAadhar_number(Integer aadhar_number) {
        this.aadhar_number = aadhar_number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", address=" + address +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", mobile_number=" + mobile_number +
                ", aadhar_number=" + aadhar_number +
                ", password='" + password + '\'' +
                '}';
    }
}

