/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendamovil.modelos;

/**
 *
 * @author yharyarias
 */
public class Celular {

    // Atributos
    private String referencia;
    private String descripcion;
    public double precio;
    public int cantidad;

    // Constructor
    public Celular(String referencia, String descripcion, double precio, int cantidad) {
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Celular() {

    }

    // Métodos o funciones
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Celular{" + "referencia=" + referencia + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    public void aplicarDescuento() {
        System.out.println("Aplicando descuento a " + referencia + " : " + descripcion);
        double descuento = 0;
        if (precio <= 50000) {
            descuento = precio * 0.1;
            System.out.println("Aplicado 10% de descuento");

        } else {
            descuento = precio * 0.05;
            System.out.println("Aplicado 5% de descuento");
        }

        setPrecio(precio - descuento);
        System.out.println("Precio original = " + precio + "  --- Precio con descuento = " + (precio - descuento));
        System.out.println("");
    }

    public void mostrarDatos() {
        System.out.println("referencia=" + referencia + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad);
    }
}
