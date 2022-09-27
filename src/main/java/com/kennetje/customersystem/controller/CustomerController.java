package com.kennetje.customersystem.controller;

import com.kennetje.customersystem.model.Customer;
import com.kennetje.customersystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public String add(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Added";
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/delete/{id}")
    public String dell(@PathVariable int id){
        customerService.deleteCustomer(id);
        return "Deleted!!";
    }

    @PutMapping("/update")
    public Customer update(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

}
