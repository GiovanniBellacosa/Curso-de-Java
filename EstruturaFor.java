
 /*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

package com.mycompany.estruturafor;

import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x,fatorial=1;
        
        System.out.println("Digite um numero inteiro para descobrir o fatorial dele: ");
        x = sc.nextInt();
        
        for(int i=1; i<=x; i++){
            fatorial *= i;
        }
        
        System.out.printf("Farorial de %d = %d%n", x,fatorial);
        
        sc.close();
    }
}
