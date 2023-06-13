package com.hjwasim.springjpaabstractioninterface.repositories;

import com.hjwasim.springjpaabstractioninterface.dto.ProductAbstraction;
import com.hjwasim.springjpaabstractioninterface.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("""
        SELECT p from Product p
""")
    List<ProductAbstraction> findAllProductAbstraction();
}
