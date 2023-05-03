/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tiendamovil;

import com.mycompany.tiendamovil.modelos.Celular;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author yharyarias
 */
public class TiendaMovil {

    public static void main(String[] args) {

        Vector<Celular> productos = new Vector<Celular>(0);
        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda móvil");

        int opcion = -1; // bandera
        while (opcion != 5) {
            System.out.println("Seleccione una opción");
            System.out.println("    1. Crear un nuevo producto");
            System.out.println("    2. Buscar producto por X referencia");
            System.out.println("    3. Aplicar descuento a todos los productos");
            System.out.println("    4. Listado de todos los productos que tengan cantidad < 10");
            System.out.println("    5. Salir");

            opcion = s.nextInt();
            System.out.println("");
            System.out.println("");
            if (opcion >= 1 && opcion <= 5) {
                switch (opcion) {
                    case 1:
                        Celular c = new Celular();

                        // Pedimos los atributos del celular
                        System.out.println("Ingresa la referencia:");
                        String ref = s.next();
                        System.out.println("Ingresa la descripción:");
                        String des = s.next();
                        System.out.println("Ingresa el precio:");
                        double pre = s.nextFloat();
                        System.out.println("Ingresa la cantidad:");
                        int cant = s.nextInt();
                        System.out.println("");
                        // Utilizamos los setters que creamos en la clase Celular
                        c.setReferencia(ref);
                        c.setDescripcion(des);
                        c.setPrecio(pre);
                        c.setCantidad(cant);

                        // Añadiendo elementos
                        productos.addElement(c);

                        productos.forEach((n) -> System.out.println(n.toString()));
                        System.out.println("-----------------------------------");
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 2:
                        Vector<Celular> localizados = new Vector<Celular>(0);
                        System.out.println("Opción 2");
                        System.out.println("Ingresa la referencia:");
                        String refCelular = s.next();
                        System.out.println("");
                        System.out.println("");

                        for (int i = 0; i < productos.size(); i++) {
                            Celular cel = productos.get(i);
                            if (cel.getReferencia().equals(refCelular)) {
                                localizados.addElement(cel);
                            }
                        }

                        System.out.println("Se encontró " + localizados.size() + " celularar(es) con la referencia " + refCelular);
                        System.out.println("-----------------------------------");
                        localizados.forEach((n) -> System.out.println(n.toString()));
                        System.out.println("-----------------------------------");
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Opción 3");
                        for (int i = 0; i < productos.size(); i++) {
                            productos.get(i).aplicarDescuento();
                            productos.get(i).mostrarDatos();
                        }
                        System.out.println("Descuentos aplicados a todos los productos");
                        break;
                    case 4:
                        System.out.println("Opción 4");
                        cant = 0;
                        for (int i = 0; i < productos.size(); i++) {
                            Celular cel = productos.get(i);
                            if (cel.getCantidad() < 10) {
                                productos.get(i).mostrarDatos();
                            }
                            
                        }
                        break;
                    case 5:
                        System.out.println("Opción 5");
                        break;

                }
            } else {
                System.out.println("-----------------------------------");
                System.out.println("Opción erronea, vuelva a intentarlo");
                System.out.println("-----------------------------------");
            }

        }

    }
}
