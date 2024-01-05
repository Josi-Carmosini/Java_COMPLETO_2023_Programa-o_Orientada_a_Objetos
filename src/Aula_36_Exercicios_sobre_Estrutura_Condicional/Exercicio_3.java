package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
			Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder 
			ser digitados em ordem crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1  = sc.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2  = sc.nextInt();
		
		if(num1%num2==0 || num2%num1==0) {
			System.out.println("Os valores lidos SÃO múltiplos entre si!");
		}else {
			System.out.println("Os valores lidos NÃO SÃO múltiplos entre si!");
		}
	}

}
