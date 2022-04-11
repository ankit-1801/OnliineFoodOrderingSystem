package com.project.foodOderingSystem.controller;

import com.project.foodOderingSystem.entity.Customer;
import com.project.foodOderingSystem.service.CustomerService;
import com.project.foodOderingSystem.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cust")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/getAll")
    private List<Customer> getAllCustomers() {
        return customerService.readCustomer();
    }

    @GetMapping("/get/{customerId}")
    private Customer getCustomer(@PathVariable("customerId") int customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        return customer;
    }

    @PutMapping("/update")
    private ResponseEntity<String> update(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return new ResponseEntity<String>("Customer details updated", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteCustomer/{customerId}")
    private ResponseEntity<String> deleteCustomer(@PathVariable("customerId") int customerId) {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("Customer with given ID is Deleted", HttpStatus.BAD_REQUEST);
    }

}
