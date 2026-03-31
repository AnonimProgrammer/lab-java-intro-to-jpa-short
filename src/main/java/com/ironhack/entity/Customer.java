package com.ironhack.entity;

import com.ironhack.model.CustomerStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CustomerStatus status = CustomerStatus.NONE;

    @Column(name = "total_customer_mileage", nullable = false)
    private Integer totalCustomerMileage;

    public Customer() {}
    public Customer(String name, CustomerStatus status, Integer totalCustomerMileage) {
        this.name = name;
        this.status = status;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
}
