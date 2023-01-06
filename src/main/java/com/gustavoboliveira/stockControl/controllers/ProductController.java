package com.gustavoboliveira.stockControl.controllers;

import com.gustavoboliveira.stockControl.dtos.ProductDTO;
import com.gustavoboliveira.stockControl.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity findAll(){
        List<ProductDTO> products = productService.findAll();

        if(products.isEmpty())
            return new ResponseEntity<>("PRODUCTS NOT FOUND", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        ProductDTO product = productService.findById(id);

        if(Objects.isNull(product))
            return new ResponseEntity<>("PRODUCT NOT FOUND", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody ProductDTO productDTO){
        ProductDTO product = productService.save(productDTO);

        if(Objects.isNull(product.getId()))
            return new ResponseEntity<>("PRODUCT NOT SAVED", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(product.toString(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id){
        boolean deleted = productService.delete(id);

        if(!deleted)
            return new ResponseEntity<>("PRODUCT NOT DELETED", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>("PRODUCT DELETED", HttpStatus.OK);
    }
}
