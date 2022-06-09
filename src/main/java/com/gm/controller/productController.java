package com.gm.controller;

import com.gm.model.product;
import com.gm.service.productService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Product")
@CrossOrigin
public class productController {
    @Autowired
    private productService service;
    
    /* Obtener todos los productos */
    @GetMapping("/")
    public List<product> getProducts(){
        return service.FindProducts();
    }
    
    /* Obtener todos los productos por categoria */
    @GetMapping("/bycategory")
    public List<product> getProducts(@RequestParam("category")int category){
        return service.findByCategory(category);
    }
    
    /* Obtener todos los productos por nombre */
    @GetMapping("/byname")
    public List<product> getProducts(@RequestParam("name")String name){
        return service.findByNameContaining(name);
    }
    
    /* Obtener Todos los productos y llamar al metodo segun parametro order */
    @GetMapping("/order")
    public List<product> getProducts(@RequestParam("order")String order,@RequestParam("limit")int limit, @RequestParam("offset")int offset){
        
        if(order.toLowerCase().equals("a-z"))return service.filterProductsOrderNameASCWithLimit(limit,offset);
        else if(order.toLowerCase().equals("z-a"))return service.filterProductsOrderNameDESCWithLimit(limit,offset);
        else if(order.toLowerCase().equals("preciomenor"))return service.filterProductsOrderPrecioASCWithLimit(limit,offset);
        else if(order.toLowerCase().equals("preciomayor"))return service.filterProductsOrderPrecioDESCWithLimit(limit,offset);
        else return service.filterProductsOrderNameASCWithLimit(limit,offset);
        
    }
    
    /* Obtener Todos los productos por nombre y llamar al metodo segun parametro order */
    @GetMapping("/bynamewithorder")
    public List<product> getProducts(@RequestParam("name")String name, @RequestParam("order")String order, @RequestParam("limit")int limit, @RequestParam("offset")int offset){
        
        if(order.toLowerCase().equals("a-z"))return service.filterProductsByNameOrderNameASCWithLimit(name,limit,offset);
        else if(order.toLowerCase().equals("z-a"))return service.filterProductsByNameOrderNameDESCWithLimit(name,limit,offset);
        else if(order.toLowerCase().equals("preciomenor"))return service.filterProductsByNameOrderPrecioASCWithLimit(name,limit,offset);
        else if(order.toLowerCase().equals("preciomayor"))return service.filterProductsByNameOrderPrecioDESCWithLimit(name,limit,offset);
        else return service.filterProductsByNameOrderNameASCWithLimit(name,limit,offset);
        
    }
    
    /* Obtener Todos los productos por categoria y llamar al metodo segun parametro order */
    @GetMapping("/bycategorywithorder")
    public List<product> getProducts(@RequestParam("category")int category, @RequestParam("order")String order, @RequestParam("limit")int limit, @RequestParam("offset")int offset){
        
        if(order.toLowerCase().equals("a-z"))return service.filterProductsByCategoryOrderNameASCWithLimit(category,limit,offset);
        else if(order.toLowerCase().equals("z-a"))return service.filterProductsByCategoryAndNameDESCWithLimit(category,limit,offset);
        else if(order.toLowerCase().equals("preciomenor"))return service.filterProductsByCategoryAndPrecioASCWithLimit(category,limit,offset);
        else if(order.toLowerCase().equals("preciomayor"))return service.filterProductsByCategoryAndPrecioDESCWithLimit(category,limit,offset);
        else return service.filterProductsByCategoryOrderNameASCWithLimit(category,limit,offset);
        
    }
    
}
