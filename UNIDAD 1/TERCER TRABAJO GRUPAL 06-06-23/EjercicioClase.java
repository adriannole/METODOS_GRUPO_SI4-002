/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author fing.labcom
 */


   import java.math.BigDecimal;

public class EjercicioClase {
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);
        String numero = "";
        int numero2 =0;
        
           System.out.println("Ingrese un numero mayor a 250");
               
               numero= leer.nextLine() ;
               numero2 =Integer.parseInt(numero);
               
        
           if(numero2  >250){
            
               
               BigDecimal x = new BigDecimal(numero); // Valor de x para la expresión
               
               // Calcular e^x
               BigDecimal ePowX = new BigDecimal(Math.exp(x.doubleValue()));
               
               // Calcular el denominador e^x - 1
               BigDecimal denominator = ePowX.subtract(BigDecimal.ONE);
               
               // Calcular el resultado final
               BigDecimal result = ePowX.divide(denominator, 1000, BigDecimal.ROUND_HALF_UP);
               
               // Imprimir el resultado 
               System.out.println(result);
           } else {
                System.out.println("El número está fuera de rango ponga un numero x "
                        + " mayor a 250");
                
           }
           }
}