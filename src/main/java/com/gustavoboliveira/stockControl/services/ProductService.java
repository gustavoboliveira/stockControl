package com.gustavoboliveira.stockControl.services;

import com.gustavoboliveira.stockControl.dtos.ProductDTO;
import com.gustavoboliveira.stockControl.models.Product;
import com.gustavoboliveira.stockControl.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public ProductDTO save(ProductDTO productDTO){
        Product product = productRepository.findByName(productDTO.getName());

        if(Objects.isNull(product)){
            product = modelMapper.map(productDTO, Product.class);
            product = productRepository.saveAndFlush(product);

            return modelMapper.map(product, ProductDTO.class);
        }

        return productDTO;
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> product = productRepository.findById(id);

        if(!product.isPresent()) {
            return null;
        }

        return modelMapper.map(product.get(), ProductDTO.class);
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> products = productRepository.findAll();

        if(products.isEmpty()) {
            return new ArrayList<>();
        }
        return modelMapper.map(products, new TypeToken<List<ProductDTO>>() {}.getType());
    }

    @Transactional
    public ProductDTO update(ProductDTO productDTO){
        Product product = productRepository.findById(productDTO.getId()).get();

        if(!productDTO.getName().equalsIgnoreCase(product.getName())) {
            product.setName(productDTO.getName());
        }

        if(!productDTO.getBuyPrice().equals(product.getBuyPrice())) {
            product.setBuyPrice(productDTO.getBuyPrice());
        }

        if(!productDTO.getSellPrice().equals(product.getSellPrice())) {
            product.setSellPrice(productDTO.getSellPrice());
        }

        if(!productDTO.getQuantity().equals(product.getQuantity())) {
            product.setQuantity(productDTO.getQuantity());
        }

        product = productRepository.saveAndFlush(product);

        return modelMapper.map(product, ProductDTO.class);
    }

    @Transactional
    public boolean delete(Long id){
        Optional<Product> product = productRepository.findById(id);

        if(product.isPresent()) {
            productRepository.deleteById(product.get().getId());
            return true;
        }

        return false;
    }
}
