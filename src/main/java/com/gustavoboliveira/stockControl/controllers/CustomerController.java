package com.gustavoboliveira.stockControl.controllers;

import com.gustavoboliveira.stockControl.dtos.CustomerDTO;
import com.gustavoboliveira.stockControl.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO customer = customerService.save(customerDTO);

        if(Objects.isNull(customer.getId())) {
            return new ResponseEntity<>("CUSTOMER NOT SAVED", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(customer.toString(), HttpStatus.OK);
    }
}
