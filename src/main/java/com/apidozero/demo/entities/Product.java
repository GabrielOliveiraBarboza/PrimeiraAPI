/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apidozero.demo.entities;

/**
 *
 * @author gabri
 */
public class Product {
    private long id; 
    private String nome; 
    private double preço;
    
    private Departament departament; 

    /**
     * @return the id
     */ 
    
    
    public Product() {
    } 

    public Product(long id, String nome, double preço, Departament departament) {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
        this.departament = departament;
    }
    

    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preço
     */
    public double getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(double preço) {
        this.preço = preço;
    }

    /**
     * @return the departament
     */
    public Departament getDepartament() {
        return departament;
    }

    /**
     * @param departament the departament to set
     */
    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
