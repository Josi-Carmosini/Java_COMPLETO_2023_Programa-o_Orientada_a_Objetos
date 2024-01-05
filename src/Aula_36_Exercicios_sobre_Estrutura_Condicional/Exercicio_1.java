package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num  = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("O valor é um número POSITIVO");
		}else {
			System.out.println("O valor é um número NEGATIVO");
		}

	}

}
