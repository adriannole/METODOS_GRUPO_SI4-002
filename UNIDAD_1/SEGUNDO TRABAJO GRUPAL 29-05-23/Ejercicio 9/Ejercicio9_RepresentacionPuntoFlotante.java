
package com.mycompany.mavenproject3;

/**
 *
 * @author Adrian Nole PC
 */

//Ejercicio 9. Represente en el estándar de coma flotante IEEE 754 de 32 bits los valores 10,25 y 6,75. Exprese el 
//resultado final en hexadecimal. Realice, a continuación, la suma de los números anteriores representados en IEEE 
//754, indicando los pasos que va realizando en cada momento.



public class Ejercicio9_RepresentacionPuntoFlotante {
    public static void main(String[] args) {
        float valor1 = 10.25f;
        float valor2 = 6.75f;

        // REPRESENTACION ESTANDAR PUNTO FLOTANTE IEEE 754
        int flotante1 = Float.floatToIntBits(valor1);
        
        int flotante2 = Float.floatToIntBits(valor2);

        String hexA = Integer.toHexString(flotante1);
        String hexB = Integer.toHexString(flotante2);
        
        String binaryA = Integer.toBinaryString(flotante1);
        String binaryB = Integer.toBinaryString(flotante2);

        System.out.println("Valor 10.25 en IEEE 754 hexadecimal: " + hexA);
        System.out.println("Valor 10.25 en IEEE 754 binario: " + binaryA);

        System.out.println("Valor 6.75 en IEEE 754 hexadecimal: " + hexB);
        System.out.println("Valor 6.75 en IEEE 754 binario: " + binaryB);

        // SUMA VALORES
        float sum = valor1 + valor2;
        int floatSum = Float.floatToIntBits(sum);
        String sumHexadecimal = Integer.toHexString(floatSum);
        String sumBinario = Integer.toBinaryString(floatSum);

        System.out.println("Suma  10.25 + 6.75 en IEEE 754 hexadecimal: " + sumHexadecimal);
        System.out.println("Suma  10.25 + 6.75 en IEEE 754 binario: " + sumBinario);
    }
}
        
        
        
        
        
  
