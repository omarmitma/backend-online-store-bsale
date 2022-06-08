package com.gm.repository;

import com.gm.model.product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer>{
    List<product> findByCategory(int category);
    
    
    
    @Query(value="SELECT * from product p WHERE p.category = :category AND p.name LIKE %:name%", nativeQuery = true)
    List<product> getAmountOfFilteredProducts(int category, String name);
    
    
    
    @Query(value="SELECT * from product p WHERE p.category = :category AND p.name LIKE %:name% ORDER BY p.name ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByNameASCWithLimit(int category, String name, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.category = :category AND p.name LIKE %:name% ORDER BY p.name DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByNameDESCWithLimit(int category, String name, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.category = :category AND p.name LIKE %:name% ORDER BY p.price ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByPrecioASCWithLimit(int category, String name, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.category = :category AND p.name LIKE %:name% ORDER BY p.price DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByPrecioDESCWithLimit(int category, String name, int limit, int offset);
}
