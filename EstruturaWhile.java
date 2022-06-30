// EXERCICIO PROPOSTO
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível,*/

package com.mycompany.estruturawhile;

import java.util.Scanner;

public class EstruturaWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, gasolina=0, alcool=0,diesel=0;
        
        System.out.println("Digite um tipo de combustivel [1]Alcool [2]Gasolina [3]Diesel ou [4]Para encerrar: ");
        x = sc.nextInt();
       
        while(x != 4){
            if(x == 1){
                alcool = alcool + 1;
            }
            else if(x == 2){
                gasolina = gasolina + 1;
            }
            else if(x == 3){
                diesel = diesel + 1;
            }
            else{
                System.out.println("Escolha invalida...");
            }
            System.out.println("Digite novamente... [1]Alcool [2]Gasolina [3]Diesel ou [4]Para encerrar: ");
            x = sc.nextInt();
        }
        
        System.out.println("Muito obrigado... ");
        System.out.printf("Quantidade de clientes que escolheram Alcool: %d%n",alcool);
        System.out.printf("Quantidade de clientes que escolheram Gasolina: %d%n",gasolina);
        System.out.printf("Quantidade de clientes que escolheram Diesel: %d%n",diesel);
        
        sc.close();
    }
}
