package com.gm.service;

import com.gm.model.product;
import com.gm.repository.ProductRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class productService {
    @Autowired
    ProductRepository repository;
    
    public List<product> FindProducts(){
        return repository.findAll();
    }
    public List<product> findByCategory(int category){
        return repository.findByCategory(category);
    }
    public List<product> findByNameContaining(String name){
        return repository.findByNameContaining(name);
    }
    
    
    
    public List<product> filterProductsOrderNameASCWithLimit(int limit, int offset){
        return repository.filterProductsOrderNameASCWithLimit(limit, offset);
    }
    public List<product> filterProductsOrderNameDESCWithLimit(int limit, int offset){
        return repository.filterProductsOrderNameDESCWithLimit(limit, offset);
    }
    public List<product> filterProductsOrderPrecioASCWithLimit(int limit, int offset){
        return repository.filterProductsOrderPrecioASCWithLimit(limit, offset);
    }
    public List<product> filterProductsOrderPrecioDESCWithLimit(int limit, int offset){
        return repository.filterProductsOrderPrecioDESCWithLimit(limit, offset);
    }
    
    
    
    public List<product> filterProductsByNameOrderNameASCWithLimit(String name, int limit, int offset){
        return repository.filterProductsByNameOrderNameASCWithLimit(name, limit, offset);
    }
    public List<product> filterProductsByNameOrderNameDESCWithLimit(String name, int limit, int offset){
        return repository.filterProductsByNameOrderNameDESCWithLimit(name, limit, offset);
    }
    public List<product> filterProductsByNameOrderPrecioASCWithLimit(String name, int limit, int offset){
        return repository.filterProductsByNameOrderPrecioASCWithLimit(name, limit, offset);
    }
    public List<product> filterProductsByNameOrderPrecioDESCWithLimit(String name, int limit, int offset){
        return repository.filterProductsByNameOrderPrecioDESCWithLimit(name, limit, offset);
    }
    
    
    
    
    public List<product> filterProductsByCategoryOrderNameASCWithLimit(int category, int limit, int offset){
        return repository.filterProductsByCategoryOrderNameASCWithLimit(category,limit, offset);
    }
    public List<product> filterProductsByCategoryAndNameDESCWithLimit(int category, int limit, int offset){
        return repository.filterProductsByCategoryAndNameDESCWithLimit(category,limit, offset);
    }
    public List<product> filterProductsByCategoryAndPrecioASCWithLimit(int category,int limit, int offset){
        return repository.filterProductsByCategoryAndPrecioASCWithLimit(category,limit, offset);
    }
    public List<product> filterProductsByCategoryAndPrecioDESCWithLimit(int category,int limit, int offset){
        return repository.filterProductsByCategoryAndPrecioDESCWithLimit(category,limit, offset);
    }
    
}
