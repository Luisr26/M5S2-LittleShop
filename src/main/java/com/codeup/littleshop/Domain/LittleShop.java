/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.codeup.littleshop.Domain;

import com.codeup.littleshop.Services.AbstractProductService;
import com.codeup.littleshop.Services.Alimento;
import com.codeup.littleshop.Services.Electrodomesticos;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Coder
 */
public class LittleShop {
    
    public static boolean esEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Object> Productos = new ArrayList<>();
        HashMap<String, Integer> Stock = new HashMap<>();
        int opcion;
        String Producto;
        double Precio;
        try {
            do {

                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      <MENU PRINCIPAL>
                                                                      1. INGRESAR PRODUCTO
                                                                      2. LISTAR PRODUCTOS
                                                                      3. EDITAR PRODUCTO
                                                                      4  ACTUALIZAR PRODUCTO
                                                                      5. BUSCAR PRODUCTO
                                                                      6. SALIR
                                                                      """));
                switch (opcion) {
                    case 1:
                        try{
                            Producto = JOptionPane.showInputDialog("Ingresa el Nombre del producto: ");
                            if(Producto.isEmpty() || Producto.isBlank() || Producto == null || esEntero(Producto)){
                                JOptionPane.showMessageDialog(null, "Ingresa datos validos");
                            }else{
                                Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Precio del Producto"));
                            }
                        }catch(Exception err){
                            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error: "+ err);
                        }
                        
                        JOptionPane.showMessageDialog(null, "Opcion 1");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Opcion 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Opcion 3");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Opcion 4");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Opcion 5");
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }

            } while (opcion != 6);
            if (opcion == 6) {
                JOptionPane.showMessageDialog(null, "Gracias Por usar nuestros Servicios!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }

        AbstractProductService alimento = new Alimento("Manzana", 2.50);
        AbstractProductService electrodomestico = new Electrodomesticos("Refrigerador", 500.00);

        // Mostrar descripción de los productos
        alimento.getDescripcion();
        electrodomestico.getDescripcion();
    }
}
