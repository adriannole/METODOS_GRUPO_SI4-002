/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author fing.labcom
 */
public class NewMain {

  public class CalculadoraValores {
    public static void main(String[] args) {
        double valorReal = 0.51e2;
        double valorAproximado = 0.50e2;

        double valorAbsoluto = Math.abs(valorReal - valorAproximado);
        double valorRelativo = valorAbsoluto / valorReal;

        System.out.println("Valor absoluto: " + valorAbsoluto);
        System.out.println("Valor relativo: " + valorRelativo);
    }
    }
}
