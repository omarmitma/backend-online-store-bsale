package com.gm.controller;

import com.gm.model.category;
import com.gm.service.categoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/Category")
public class categoryControlller {
    @Autowired
    categoryService service;
    
    @GetMapping("/findAll")
    public List<category> findAll(){
        return service.findAll();
    }
}
