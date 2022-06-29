/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num;
        int num_hrs;
        double valor;
        double salario;
        
        System.out.println("Digite o numero do funcionario: ");
        num = sc.nextInt();
        
        System.out.println("Digite o numero de horas trabalhadas do funcionario: ");
        num_hrs = sc.nextInt();
        
        System.out.println("Digite o valor da hora trabalhada: ");
        valor = sc.nextDouble();
        
        salario = num_hrs * valor;
        
        System.out.printf("Numero do funcionario: %d%n", num);
        System.out.printf("salario do funcionario: %.2f%n", salario);
        
        sc.close();
    }
}
