/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Adrian Nole PC
 */
public class Bolzano {

    public static double function(double x) {
        // Define la función para la cual deseas encontrar el cero
        return x * x - 4;
    }

    public static void main(String[] args) {
        double a = 1; // Extremo izquierdo del intervalo
        double b = 3; // Extremo derecho del intervalo
        double epsilon = 0.0001; // Tolerancia para la aproximación del cero

        if (function(a) * function(b) > 0) {
            System.out.println("No se puede aplicar el teorema de Bolzano en el intervalo [" + a + ", " + b + "]");
            return;
        }

        double c;
        do {
            c = (a + b) / 2; // Calcula el punto medio del intervalo
            if (function(c) == 0) {
                break; // Se encontró el cero exacto
            } else if (function(a) * function(c) < 0) {
                b = c; // El cero se encuentra en el intervalo [a, c]
            } else {
                a = c; // El cero se encuentra en el intervalo [c, b]
            }
        } while (Math.abs(function(c)) > epsilon);

        System.out.println("El cero aproximado es: " + c);
    }
}
