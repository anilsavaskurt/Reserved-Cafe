package com.reserved.cafe.api;

import com.reserved.cafe.domain.Customer;
import com.reserved.cafe.services.interfaces.CustomerService;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAll")
    public  DataResult<List<Customer>> getAll(){return this.customerService.getAll();}

    @GetMapping("/customerByName")
    public DataResult<Customer> getCustomerByName(String userName){
        return this.customerService.getCustomerByName(userName);
    }

    @PostMapping("/add")
    public BaseResult add(@RequestBody Customer customer){
        return this.customerService.add(customer);
    }
}
