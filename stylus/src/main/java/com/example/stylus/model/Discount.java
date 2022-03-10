package com.example.stylus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Discount {
    @Id
    @GeneratedValue
    private int id;
    private int serviceId;
    private String discountCode;
    private float disountAmmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public float getDisountAmmount() {
        return disountAmmount;
    }

    public void setDisountAmmount(float disountAmmount) {
        this.disountAmmount = disountAmmount;
    }

    public Discount(String discountCode, float disountAmmount) {
        this.discountCode = discountCode;
        this.disountAmmount = disountAmmount;
    }

    public Discount() {
    }

}
