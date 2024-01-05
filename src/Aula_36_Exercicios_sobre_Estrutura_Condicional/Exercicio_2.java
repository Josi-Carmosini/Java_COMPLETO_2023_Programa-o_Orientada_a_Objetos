package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num  = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O valor é um número PAR");
		}else {
			System.out.println("O valor é um número ÍMPAR");
		}

	}

}
