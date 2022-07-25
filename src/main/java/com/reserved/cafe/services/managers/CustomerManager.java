package com.reserved.cafe.services.managers;

import com.reserved.cafe.domain.Customer;
import com.reserved.cafe.repositories.CustomerRepository;
import com.reserved.cafe.services.interfaces.CustomerService;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;
import com.reserved.cafe.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerManager(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public DataResult<Customer> getCustomerByName(String name) {
        return new DataResult<Customer>(customerRepository.getCustomerByName(name), true);
    }

    @Override
    public DataResult<List<Customer>> getAll() {
        return new  DataResult<List<Customer>>(customerRepository.findAll(), true);
    }

    @Override
    public BaseResult add(Customer customer) {
        this.customerRepository.save(customer);
        return new SuccessResult("Müşteri Eklendi");
    }
}
