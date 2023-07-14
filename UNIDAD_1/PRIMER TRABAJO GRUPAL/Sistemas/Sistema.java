/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;



public class Sistema {
    public static void main(String[] args) {
        // 1. Pasar al sistema decimal el numero 101111(base 2)
        String binario = "101111";
        int decimal = Integer.parseInt(binario, 2);
        System.out.println("Resultado " + binario+  " (base 10):"  + decimal);

        // 2. Pasar el numero 27,025(base 10) a binario
        double decimal2 = 27.025;
        String binario2 = Double.toString(decimal2);
        int punto = binario2.indexOf(".");
        int parteEntera = Integer.parseInt(binario2.substring(0, punto));
        double parteDecimal = Double.parseDouble(binario2.substring(punto));
        String binarioResultado = Integer.toBinaryString(parteEntera) + ".";
        while (parteDecimal > 0) {
            parteDecimal *= 2;
            int bit = (int) parteDecimal;
            binarioResultado += bit;
            if (bit == 1) {
                parteDecimal -= 1;
            }
        }
        System.out.println("Resultado" +decimal2+ " (base 2): " + binarioResultado);

        // 3. 42(base 8) a base 10
        String octa = "42";
        int decimal3 = Integer.parseInt(octa, 8);
        System.out.println("Resultado " +octa + " (base 10): " + decimal3);

        // 4. 64(base 10) a base binaria
        int decimal4 = 64;
        String binario3 = Integer.toBinaryString(decimal4);
        System.out.println("Resultado " +decimal4+ " (base 2): " + binario3);

        // 5. 145(base 10) a base binaria
        int decimal5 = 145;
        String binario4 = Integer.toBinaryString(decimal5);
        System.out.println("Resultado " +decimal5 + " (base 2): " + binario4);

        // 6. C(base 16) a base 10
        String hexa = "C";
        int decimal6 = Integer.parseInt(hexa, 16);
        System.out.println("Resultado " + hexa + " (base 10): " + decimal6);

        // 7. ABCD(base 16) a base 10
        String hexa2 = "ABCD";
        int decimal7 = Integer.parseInt(hexa2, 16);
        System.out.println("Resultado " + hexa2 +  " (base 10): " + decimal7);
    } 
}

