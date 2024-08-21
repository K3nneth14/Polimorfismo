/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Kenneth
 */
public class Main {
    public static void main(String[] args) {
        Producto miProducto;

        miProducto = new Ropa();
        miProducto.mostrarDetalles(); // Salida: Esta es una prenda de ropa

        miProducto = new Electronica();
        miProducto.mostrarDetalles(); // Salida: Este es un dispositivo electrónico

        miProducto = new Libro();
        miProducto.mostrarDetalles(); // Salida: Este es un libro
    }
}