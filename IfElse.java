/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ifelse;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class IfElse {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int cod, qtde;
        double valor;
        
        System.out.println("Digite o codigo do item: ");
        cod = sc.nextInt();
        
        System.out.println("Digite o qtde desejada do item: ");
        qtde = sc.nextInt();
        
        if(cod == 1){
            valor = 4.0 * qtde;
        }
        else if(cod == 2){
            valor = 4.5 * qtde;
        }
        else if(cod == 3){
            valor = 5.0 * qtde;
        }
        else if(cod == 4){
            valor = 2.0 * qtde;
        }
        else{
            valor = 1.5 * qtde;
        }
        
        System.out.printf("Total: %.2f", valor);
        
        sc.close();
    }
}
