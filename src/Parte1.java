/**
 * Taller 6 - Parte 1: Arreglos de una dimensión
 * Integrante A: Carlos Barria
 * Integrante B: Carlos Barria2
 * Fecha: 11/23/2026
 *
 * INSTRUCCIONES:
 * Copia aquí el código completo que aparece en el documento del taller.
 * Luego ejecuta, verifica la salida y responde las preguntas en respuestas/parte1.txt
 */

import javax.swing.JOptionPane;

public class Parte1 {
    public static void main(String[] args) {

        // 1. DECLARACIÓN Y CREACIÓN del arreglo
        //    int[] notas  → declara la variable
        //    = new int[5] → crea el arreglo con espacio para 5 enteros
        int[] notas = {55, 72, 88, 91, 44, 67, 78, 83};

        // 2. LLENADO: pedimos 5 notas al usuario
       

        // 3. CÁLCULO de suma y promedio
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];   // acumula cada nota
        }
        double promedio = (double) suma / notas.length;

        // 4. BÚSQUEDA de nota máxima y mínima
        int maximo = notas[0];   // asumimos que el primero es el mayor
        int minimo = notas[0];   // asumimos que el primero es el menor
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximo) maximo = notas[i];
            if (notas[i] < minimo) minimo = notas[i];
        }

        // 5. CONSTRUCCIÓN del reporte
        StringBuilder reporte = new StringBuilder();
        reporte.append("=== REPORTE DE NOTAS ===\n");
        reporte.append("Notas ingresadas: ");
        for (int i = 0; i < notas.length; i++) {
            reporte.append(notas[i]);
            if (i < notas.length - 1) reporte.append(", ");
        }
        reporte.append("\n");
        reporte.append(String.format("Suma     : %d%n", suma));
        reporte.append(String.format("Promedio : %.2f%n", promedio));
        reporte.append(String.format("Máxima   : %d%n", maximo));
        reporte.append(String.format("Mínima   : %d%n", minimo));

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
