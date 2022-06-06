package com.gm.controller;

import com.gm.model.product;
import com.gm.service.productService;
import java.io.Console;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Product")
@CrossOrigin
public class productController {
    @Autowired
    private productService service;
    
    @GetMapping("/findAll")
    public List<product> FindProducts(){
        return service.FindProducts();
    }
    
    @GetMapping("/findByCategory")
    public List<product> findByCategory(@RequestParam("category")int category){
        return service.findByCategory(category);
    }
    
    /* Obtener Cantidad de productos filtrados para la paginacion */
    @GetMapping("/getAmountOfFilteredProducts")
    public List<product> getAmountOfFilteredProducts(@RequestParam("category")int category,@RequestParam("name")String name){
        return service.getAmountOfFilteredProducts(category, name);
    }
    
    /* Obtener Productos filtrados ordenados */
    @GetMapping("/filterProductsByNameASCWithLimit")
    public List<product> filterProductsByNameASCWithLimit(@RequestParam("category")int category,@RequestParam("name")String name,
            @RequestParam("limit")int limit, @RequestParam("offset")int offset){
        return service.filterProductsByNameASCWithLimit(category, name, limit,offset);
    }
    @GetMapping("/filterProductsByNameDESCWithLimit")
    public List<product> filterProductsByNameDESCWithLimit(@RequestParam("category")int category,@RequestParam("name")String name,
            @RequestParam("limit")int limit, @RequestParam("offset")int offset){
        return service.filterProductsByNameDESCWithLimit(category, name, limit,offset);
    }
    @GetMapping("/filterProductsByPrecioASCWithLimit")
    public List<product> filterProductsByPrecioASCWithLimit(@RequestParam("category")int category,@RequestParam("name")String name,
            @RequestParam("limit")int limit, @RequestParam("offset")int offset){
        return service.filterProductsByPrecioASCWithLimit(category, name, limit,offset);
    }
    @GetMapping("/filterProductsByPrecioDESCWithLimit")
    public List<product> filterProductsByPrecioDESCWithLimit(@RequestParam("category")int category,@RequestParam("name")String name,
            @RequestParam("limit")int limit, @RequestParam("offset")int offset){
        return service.filterProductsByPrecioDESCWithLimit(category, name, limit,offset);
    }
    
}
