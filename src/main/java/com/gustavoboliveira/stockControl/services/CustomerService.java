package com.gustavoboliveira.stockControl.services;

import com.gustavoboliveira.stockControl.dtos.CustomerDTO;
import com.gustavoboliveira.stockControl.models.Customer;
import com.gustavoboliveira.stockControl.repositories.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Resource
    private ModelMapper modelMapper;

    @Transactional
    public CustomerDTO save(CustomerDTO customerDTO){
        Customer customer = customerRepository.findByName(customerDTO.getName());

        if(Objects.isNull(customer)){
            customer = modelMapper.map(customerDTO, Customer.class);
            customer = customerRepository.saveAndFlush(customer);

            return modelMapper.map(customer, CustomerDTO.class);
        }

        return customerDTO;
    }
}
