/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.codeup.littleshop.Domain;

import com.codeup.littleshop.Services.AbstractProductService;
import com.codeup.littleshop.Services.Alimento;
import com.codeup.littleshop.Services.Electrodomesticos;
/**
 *
 * @author Coder
 */
public class LittleShop {

    public static void main(String[] args) {
        AbstractProductService alimento = new Alimento("Manzana", 2.50);
        AbstractProductService electrodomestico = new Electrodomesticos("Refrigerador", 500.00);
        
        // Mostrar descripción de los productos
        alimento.getDescripcion();
        electrodomestico.getDescripcion();
    }
}
