/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.littleshop.Services;

/**
 *
 * @author Coder
 */
public abstract class AbstractProductService {

    private String nombre;
    protected double precio;

    public AbstractProductService(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodo Abstracto para obtener la descripcion del producto
    public abstract void getDescripcion();

    // Para acceder al Precio de manera si estamos por fuera de la clase
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto: "
                + "Nombre: " + nombre
                + "Precio: " + precio;
    }

}
