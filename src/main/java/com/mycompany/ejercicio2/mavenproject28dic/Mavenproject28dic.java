/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2.mavenproject28dic;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject28dic {
 public static void main(String[] args) {
        String nombre = "";
        int edad = 0;

        double notas[] = {7, 10, 8, 9, 6, 2, 4};
        double notas2[] = {7, 10, 6, 9};
        nombre = JOptionPane.showInputDialog("Ingresar nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));

        mensaje(nombre, edad);
        JOptionPane.showMessageDialog(null, "el promedio es" + promedio(notas));
        JOptionPane.showMessageDialog(null, "el promedio es" + promedio(notas2));
    }

    public static void mensaje(String nombres, int edades) {
        JOptionPane.showMessageDialog(null, nombres + " tiene " + edades + "años ");
    }

    static double promedio(double[] calificaciones) {

        double suma = 0;
        double respuesta = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        respuesta = suma / calificaciones.length;
        return respuesta;
    }

}
