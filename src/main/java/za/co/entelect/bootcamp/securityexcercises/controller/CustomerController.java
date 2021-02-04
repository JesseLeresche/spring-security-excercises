package za.co.entelect.bootcamp.securityexcercises.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.entelect.bootcamp.securityexcercises.entity.Customer;
import za.co.entelect.bootcamp.securityexcercises.repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping ("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
