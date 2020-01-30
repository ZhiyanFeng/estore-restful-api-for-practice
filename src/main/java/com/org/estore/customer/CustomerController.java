package com.org.estore.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    List<Customer> all(){
        return repository.findAll();
    }


    @GetMapping("/customer/{id}")
    public Customer getCustomer (@PathVariable long id){
        Optional<Customer> customer = repository.findById(id);
//        if(!customer.isPresent()){
//            throw new CustomerNotFoundException("id-" + id);
//        }

        return customer.get();

    }
}
