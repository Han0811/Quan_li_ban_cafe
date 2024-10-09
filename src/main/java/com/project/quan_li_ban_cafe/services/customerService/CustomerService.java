package com.project.quan_li_ban_cafe.services.customerService;

import com.project.quan_li_ban_cafe.models.Customer;
import com.project.quan_li_ban_cafe.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        if(customer != null) {
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public Customer updateCustomer(long id, Customer customer) {
        if(customer != null) {
            Customer result = customerRepository.getById(id);
            if(result != null) {
                result.setFullname(customer.getFullname());
                result.setPhone_number(customer.getPhone_number());
                result.setAddress(customer.getAddress());

                return customerRepository.save(result);
            }
        }
        return null;
    }

    @Override
    public boolean deleteCustomer(long id) {
        if(id > 0){
            Customer result = customerRepository.getById(id);
            if(result != null) {
                customerRepository.delete(result);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getOneCustomer(long id) {
        return customerRepository.getById(id);
    }
}
