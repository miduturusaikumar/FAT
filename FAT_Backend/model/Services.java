package com.backend.FAT_Backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Services")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="service_id")
    private Integer service_id;

    @Column(name="service_category")
    private String Service_category;

    @Column(name="description")
    private String description;

    public Services(Integer service_id, String service_category, String description) {
        this.service_id = service_id;
        Service_category = service_category;
        this.description = description;
    }

    public Services() {

    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public String getService_category() {
        return Service_category;
    }

    public void setService_category(String service_category) {
        Service_category = service_category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Services{" +
                "service_id=" + service_id +
                ", Service_category='" + Service_category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
