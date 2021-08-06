/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01;

import java.util.Scanner;

/**
 *
 * @author deia_
 */
public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1]Crie um programa onde o usuário entre com dois números e ele diga qual é maior");
        System.out.println("[2]Crie um programa onde o usuário entre com o número de dias e ele converta para segundos");
        System.out.println("[3]Crie um programa onde o usuário entre com um número e ele diga se ele é par ou impar");
        System.out.println("[4]Crie um programa onde o usuário entre com 3 números e ele imprime a média dos números");
        System.out.println("[5]Crie um programa que imprime os números de 1 até 10");
        System.out.println("[6]Crie um programa onde o usuário entre com um número e ele calcula o fatorial dele");
        System.out.println("");
        System.out.println("insira o numero do execicio desejado: ");
        int escolha = sc.nextInt();
        
        if (escolha == 1){
            System.out.println("vc escolheu o Exercicio:");
            System.out.println("");
            System.out.println("[1]Crie um programa onde o usuário entre com dois números e ele diga qual é maior");
            System.out.println("");
            System.out.println("Insira o primeiro numero: ");
            int num1 = sc.nextInt();
            System.out.println("Insira o segundo numero: ");
            int num2 = sc.nextInt();
            if(num1 > num2){
                System.out.println("O numero "+num1+" é maior que o numero "+num2);
            }else{
                System.out.println("O numero "+num2+" é maior que o numero "+num1);
            }
        }else if (escolha == 2){
            System.out.println("vc escolheu o Exercicio:");
            System.out.println("");
            System.out.println("[2]Crie um programa onde o usuário entre com o número de dias e ele converta para segundos");
            System.out.println("");
            System.out.println("Informe o numero de dias: ");
            int dias = sc.nextInt();
            int resultado = dias * 86400;
            System.out.println("o numero de dias "+dias+" tem "+resultado+" segundos");
        }else  if (escolha == 3){
            System.out.println("vc escolheu o Exercicio:");
            System.out.println("[3]Crie um programa onde o usuário entre com um número e ele diga se ele é par ou impar");
            System.out.println("");
            System.out.println("insira o numero: ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("O numero "+num+" é par");
            }else{
                System.out.println("O numero "+num+" é impar");
            }
        }else if (escolha == 4){
            System.out.println("vc escolheu o Exercicio:");
            System.out.println("[4]Crie um programa onde o usuário entre com 3 números e ele imprime a média dos números");
            System.out.println("");
            System.out.println("Insira o primerio numero: ");
            int num1 = sc.nextInt();
            System.out.println("Insira o segundo numero: ");
            int num2 = sc.nextInt();
            System.out.println("Insira o terceiro numero: ");
            int num3 = sc.nextInt();
            float resultado = (num1+num2+num3)/3;
            System.out.println("A media dos numeros escolhidos é: "+resultado);
        }else if (escolha == 5){
            System.out.println("vc escolheu o Exercicio:");
            System.out.println("[5]Crie um programa que imprime os números de 1 até 10");
            System.out.println("");
            for (int i = 1; i <= 10 ; i++ ) {
            System.out.println(i);
            }
        }else if (escolha == 6){
            int num1;
            int num2;
            System.out.println("vc escolheu o Exercicio:");
            System.out.println("[6]Crie um programa onde o usuário entre com um número e ele calcula o fatorial dele");
            System.out.println("");
            System.out.println("insira o valor desejado: ");
            int valor = sc.nextInt();
            int f = valor;
            while (valor > 1){
                f = f *(valor-1); valor--;
                System.out.println(f);
            }
            System.out.println("O resultado é: "+f);
        }else {
            System.out.println("Escolha um numero valido por favor");
        }          
    }
}
