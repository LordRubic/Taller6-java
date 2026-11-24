/**
 * Taller 6 - Parte 3: Clase Producto para arreglo de objetos
 * Integrante A: ___________________________
 * Integrante B: ___________________________
 *
 * INSTRUCCIONES:
 * Copia aquí la clase Producto completa que aparece en el documento del taller.
 * Este archivo debe compilarse JUNTO con Parte3.java:
 *   javac src/Producto.java src/Parte3.java
 */
/**
 * Clase que representa un producto de inventario.
 * Un arreglo de objetos Producto forma el inventario.
 */

public class Producto {

    // Atributos del producto
    String nombre;
    double precio;
    int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Calcula el valor total del producto
    public double valorTotal() {
        return precio * stock;
    }

    // Muestra la información del producto
    public String toString() {
        return String.format("%-12s  $%7.2f   stock: %3d   valor: $%8.2f",
            nombre, precio, stock, valorTotal());
    }
}


