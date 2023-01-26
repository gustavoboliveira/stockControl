package com.gustavoboliveira.stockControl.controllers;

import com.gustavoboliveira.stockControl.dtos.CustomerDTO;
import com.gustavoboliveira.stockControl.models.Customer;
import com.gustavoboliveira.stockControl.services.BasicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Resource
    private BasicService<Customer, CustomerDTO, Long> basicService;


    @PostMapping
    public ResponseEntity save(@RequestBody CustomerDTO customerDTO){

        CustomerDTO customer = basicService.save(customerDTO, Customer.class);

        if(Objects.isNull(customer.getId())) {
            return new ResponseEntity<>("CUSTOMER NOT SAVED", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(customer.toString(), HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        CustomerDTO customer = basicService.findById(id);

        if(Objects.isNull(customer)) {
            return new ResponseEntity<>("CUSTOMER NOT FOUND", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<CustomerDTO> customers = basicService.findAll();

        if(customers.isEmpty()) {
            return new ResponseEntity<>("PRODUCTS NOT FOUND", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        boolean deleted = basicService.delete(id);

        if(!deleted) {
            return new ResponseEntity<>("PRODUCT NOT DELETED", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("PRODUCT DELETED", HttpStatus.OK);
    }
}
