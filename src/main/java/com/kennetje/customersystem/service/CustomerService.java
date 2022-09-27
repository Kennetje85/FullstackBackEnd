package com.kennetje.customersystem.service;


import com.kennetje.customersystem.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public String deleteCustomer(int id);
    public Customer updateCustomer(Customer customer);

}
