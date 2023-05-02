/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apidozero.demo.controller;

import com.apidozero.demo.entities.Departament;
import com.apidozero.demo.entities.Product;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabri
 */
@RestController
@RequestMapping(value="/product")
public class ProductController {
   
    @GetMapping
    public List<Product> getObjects() {
            Departament d1 = new Departament(1l, "Tech");
            Departament d2 = new Departament (2l, "Pet");
            
            Product p1 = new Product(1l, "Macbook Pro", 4000, d1);
            Product p2 = new Product(2l, "PC Gamer", 2500, d1);
            Product p3 = new Product(3l, "Pet house", 1500, d2); 
            
            List<Product> list = Arrays.asList(p1,p2,p3);

           return list;
    }
           
}
