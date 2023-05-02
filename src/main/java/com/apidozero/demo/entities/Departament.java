/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apidozero.demo.entities;

/**
 *
 * @author gabri
 */
public class Departament {
    private long id; 
    private String nome; 

    /**
     * @return the id
     */
    
    public Departament() {
    } 

    public Departament(long id, String nome) {
        this.id = id;
        this.nome = nome;
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
    
}
