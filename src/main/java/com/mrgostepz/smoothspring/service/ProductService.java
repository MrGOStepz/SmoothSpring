package com.mrgostepz.smoothspring.service;

import com.mrgostepz.smoothspring.db.repository.IngredientRepository;
import com.mrgostepz.smoothspring.db.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private static final Logger logger = LogManager.getLogger(ProductService.class);

    private final ProductRepository productRepository;
    private final IngredientRepository ingredientRepository;


    public ProductService(ProductRepository productRepository, IngredientRepository ingredientRepository) {
        this.productRepository = productRepository;
        this.ingredientRepository = ingredientRepository;
    }
}
