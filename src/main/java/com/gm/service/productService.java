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
    
    public List<product> getAmountOfFilteredProducts(int category, String name){
        return repository.getAmountOfFilteredProducts(category, name);
    }
    
    public List<product> filterProductsByNameASCWithLimit(int category, String name, int limit, int offset){
        return repository.filterProductsByNameASCWithLimit(category,name, limit, offset);
    }
    
    public List<product> filterProductsByNameDESCWithLimit(int category, String name, int limit, int offset){
        return repository.filterProductsByNameDESCWithLimit(category,name, limit, offset);
    }
    
    public List<product> filterProductsByPrecioASCWithLimit(int category, String name, int limit, int offset){
        return repository.filterProductsByPrecioASCWithLimit(category,name, limit, offset);
    }
    
    public List<product> filterProductsByPrecioDESCWithLimit(int category, String name, int limit, int offset){
        return repository.filterProductsByPrecioDESCWithLimit(category,name, limit, offset);
    }
    
}
