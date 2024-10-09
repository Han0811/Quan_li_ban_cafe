package com.project.quan_li_ban_cafe.controllers;

import com.project.quan_li_ban_cafe.models.Customer;
import com.project.quan_li_ban_cafe.services.customerService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/updatecustomer")
    public Customer updateCustomer(@PathVariable long id,@RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/deletecustomer")
    public boolean deleteCustomer(@PathVariable long id) {
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/list")
    public List<Customer> listCustomer() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/onecustomer")
    public Customer getCustomerById(@PathVariable long id) {
        return customerService.getOneCustomer(id);
    }
}
