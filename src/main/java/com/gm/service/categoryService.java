package com.gm.service;

import com.gm.model.category;
import com.gm.repository.CategoryRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class categoryService {
    @Autowired
    CategoryRepository repository;
    
    public List<category> findAll(){
        return repository.findAll();
    }
}
