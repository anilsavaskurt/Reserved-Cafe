package com.reserved.cafe.services.interfaces;

import com.reserved.cafe.domain.Customer;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;

import java.util.List;

public interface CustomerService {

    DataResult<Customer> getCustomerByName(String name);
    DataResult<List<Customer>> getAll();
    BaseResult add(Customer customer);

}
