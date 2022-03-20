package com.mrgostepz.smoothspring.db.repository;

import com.mrgostepz.smoothspring.model.db.Product;
import com.mrgostepz.smoothspring.model.db.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> getProductInfoByColumn(String columnName, String value);
}
