/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.Scanner;

public class MetodoBiseccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la ecuación en función de x para el calculo por metodo Biseccion :");
        String ecuacion = scanner.nextLine();

        System.out.println("Ingrese el límite inferior del intervalo:");
        double limiteInferior = scanner.nextDouble();

        System.out.println("Ingrese el límite superior del intervalo:");
        double limiteSuperior = scanner.nextDouble();

//valor de la toleracion x defecto : 
        double tolerancia = 0.0001;
        double resultado = ValorRaices(ecuacion, limiteInferior, limiteSuperior, tolerancia);

        System.out.println("El resultado es: " + resultado);
    }

    public static double ValorRaices(String ecuacion, double limiteInferior, double limiteSuperior, double tolerancia) {
        double raiz = 0.0;
        double valorMedio = (limiteInferior + limiteSuperior) / 2;

        while (Math.abs(evaluarEcuacion(ecuacion, valorMedio)) > tolerancia) {
            if (evaluarEcuacion(ecuacion, limiteInferior) * evaluarEcuacion(ecuacion, valorMedio) < 0) {
                limiteSuperior = valorMedio;
            } else {
                limiteInferior = valorMedio;
            }

            valorMedio = (limiteInferior + limiteSuperior) / 2;
        }

        raiz = valorMedio;
        return raiz;
    }

    public static double evaluarEcuacion(String ecuacion, double x) {

        return 0.0;
    }
    
    
    
    
}
