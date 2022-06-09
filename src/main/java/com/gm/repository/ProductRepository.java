package com.gm.repository;

import com.gm.model.product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer>{
    List<product> findByCategory(int category);
    
    List<product> findByNameContaining(String name);
    
    
    @Query(value="SELECT * from product p ORDER BY p.name ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsOrderNameASCWithLimit(int limit, int offset);
    
    @Query(value="SELECT * from product p ORDER BY p.name DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsOrderNameDESCWithLimit(int limit, int offset);
    
    @Query(value="SELECT * from product p ORDER BY p.price ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsOrderPrecioASCWithLimit(int limit, int offset);
    
    @Query(value="SELECT * from product p ORDER BY p.price DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsOrderPrecioDESCWithLimit(int limit, int offset);
    
    
    
    @Query(value="SELECT * from product p WHERE p.name LIKE %:name% ORDER BY p.name ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByNameOrderNameASCWithLimit(String name, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.name LIKE %:name% ORDER BY p.name DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByNameOrderNameDESCWithLimit(String name, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.name LIKE %:name% ORDER BY p.price ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByNameOrderPrecioASCWithLimit(String name, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.name LIKE %:name% ORDER BY p.price DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByNameOrderPrecioDESCWithLimit(String name, int limit, int offset);
    
    
    
    
    @Query(value="SELECT * from product p WHERE p.category = :category ORDER BY p.name ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByCategoryOrderNameASCWithLimit(int category, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.category = :category ORDER BY p.name DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByCategoryAndNameDESCWithLimit(int category, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.category = :category ORDER BY p.price ASC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByCategoryAndPrecioASCWithLimit(int category, int limit, int offset);
    
    @Query(value="SELECT * from product p WHERE p.category = :category ORDER BY p.price DESC LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<product> filterProductsByCategoryAndPrecioDESCWithLimit(int category, int limit, int offset);
}
