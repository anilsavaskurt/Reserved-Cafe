package com.reserved.cafe.repositories;

import com.reserved.cafe.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer getCustomerByName(String userName);
}