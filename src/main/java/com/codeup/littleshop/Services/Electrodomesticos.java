/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.littleshop.Services;

/**
 *
 * @author Coder
 */
public class Electrodomesticos extends AbstractProductService{
    public Electrodomesticos(String nombre, double precio){
        super(nombre, precio);
    }
    
    @Override
    public void getDescripcion(){
        System.out.println("Electrodomestico: "+nombre+" precio: $"+precio);
    }
}
