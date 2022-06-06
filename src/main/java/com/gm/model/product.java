package com.gm.model;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name = "name")
    private String name;
    
    @NotNull
    @Column(name = "url_image")
    private String url_image;
    
    @NotNull
    @Column(name = "price")
    private double price;
    
    @NotNull
    @Column(name = "discount")
    private int discount;
    
    @NotNull
    @Column(name = "category")
    private int category;

    public product() {
    }
    
    public product(int id, String name, String url_image, double price, int discount, int category) {
        this.id = id;
        this.name = name;
        this.url_image = url_image;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }
    
}
