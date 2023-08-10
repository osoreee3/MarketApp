package com.osoree.marketapp.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getList(){
        return this.productRepository.findAll();
    }

    public void create(String name, int price){
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        p.setCreateDate(LocalDateTime.now());
        this.productRepository.save(p);
    }

    public Product getProduct(Long id) {

        Optional<Product> product =  this.productRepository.findById(id);
        //TODO:if예외처리
        return product.get();
    }
}
