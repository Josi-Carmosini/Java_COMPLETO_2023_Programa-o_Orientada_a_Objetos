package Aula_29_Exercícios_sobre_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		// soma desses números com uma
		// mensagem explicativa, conforme exemplos.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("\nENTRADAS:");
		System.out.println(n1);
		System.out.println(n2);

		System.out.println("\nSAÍDA:");
		System.out.println("SOMA = " + (n1 + n2));

	}

}
