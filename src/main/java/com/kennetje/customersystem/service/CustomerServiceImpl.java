package com.kennetje.customersystem.service;

import com.kennetje.customersystem.model.Customer;
import com.kennetje.customersystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public String deleteCustomer(int id) {
        customerRepository.deleteById(id);
        return "Removed"+id;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(customer);
        existingCustomer.setName(customer.getName());
        existingCustomer.setAddress(customer.getAddress());
        return customerRepository.save(customer);
    }
}

