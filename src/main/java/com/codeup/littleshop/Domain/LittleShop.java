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

        ArrayList<AbstractProductService> Productos = new ArrayList<>();
        HashMap<String, Integer> Stock = new HashMap<>();
        int opcion;
        String Producto;
        double Precio;
        String StockProducto;
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
                        try {
                            boolean estado = false;
                            while (true) {
                                if (estado == true) {
                                    break;
                                }

                                Producto = JOptionPane.showInputDialog("Ingresa el Nombre del producto: ");
                                if (Producto.isEmpty() || Producto.isBlank() || Producto == null || esEntero(Producto)) {
                                    JOptionPane.showMessageDialog(null, "Ingresa datos validos");
                                } else {
                                    while (true) {
                                        if (estado == true) {
                                            break;
                                        }

                                        try {
                                            Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Precio del Producto"));
                                            if (Precio < 0 || Precio == 0) {
                                                JOptionPane.showMessageDialog(null, "Ingresa Datos validos (No numero negativos, ni valores nulos)");
                                            } else {
                                                try {
                                                    while (true) {
                                                        StockProducto = JOptionPane.showInputDialog(null, "Ingrsa el Stock del Producto");
                                                        if (esEntero(StockProducto)) {
                                                            Productos.add(new AbstractProductService(Producto,Precio) {
                                                                @Override
                                                                public void getDescripcion() {
                                                                    throw new UnsupportedOperationException("Not supported yet.");
                                                                }
                                                            });
                                                            JOptionPane.showMessageDialog(null, "Producto Creado Con Exito");
                                                            estado = true;
                                                            break;
                                                        } else {
                                                            JOptionPane.showMessageDialog(null, "Ingresa Datos Validos");
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error: " + e);
                                                }
                                            }
                                        } catch (Exception err) {
                                            JOptionPane.showMessageDialog(null, "Ingresa Solo numero");
                                        }
                                    }

                                }
                            }
                        } catch (Exception err) {
                            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error: " + err);
                        }
                        break;
                    case 2:
                        for(AbstractProductService p : Productos){
                            JOptionPane.showMessageDialog(null, p);
                        }
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
                        JOptionPane.showMessageDialog(null, "Gracias Por usar nuestros Servicios!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La Opcion numero: " + opcion + " No corresponde a ninguna de las que esta disponible");
                }

            } while (opcion != 6);
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
