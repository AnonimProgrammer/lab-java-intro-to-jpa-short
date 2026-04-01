package com.ironhack.repository;

import com.ironhack.entity.Customer;
import com.ironhack.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByName(String name);

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByTotalCustomerMileageBetween(Integer min, Integer max);
}
