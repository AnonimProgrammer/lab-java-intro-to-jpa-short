package com.ironhack.entity;

import com.ironhack.model.CustomerStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CustomerStatus status = CustomerStatus.NONE;

    @Column(name = "total_customer_mileage", nullable = false)
    private Long totalCustomerMileage;

    public Customer() {}
    public Customer(String name, CustomerStatus status, Long totalCustomerMileage) {
        this.name = name;
        this.status = status;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Long totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
}
