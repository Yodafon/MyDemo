package com.example.MyDemo;

import java.math.BigDecimal;

/**
 * Created by Laci on 2016.03.29..
 */
public class Contact {

    String name;
    String phone;
    String description;
    BigDecimal latitude;
    BigDecimal longitude;

    public Contact(String name, String phone, String description, BigDecimal latitude, BigDecimal longitude) {
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
