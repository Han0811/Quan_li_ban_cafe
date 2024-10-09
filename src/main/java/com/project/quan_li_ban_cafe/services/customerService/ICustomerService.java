package com.project.quan_li_ban_cafe.services.customerService;

import com.project.quan_li_ban_cafe.models.Customer;

import java.util.List;

public interface ICustomerService {
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(long id,Customer customer);
    public boolean deleteCustomer(long id);
    public List<Customer> getAllCustomers();
    public Customer getOneCustomer(long id);
}
