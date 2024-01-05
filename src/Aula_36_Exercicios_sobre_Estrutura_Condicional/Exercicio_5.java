package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		/*
		  Com base na tabela abaixo, escreva um programa que leia o código de um item e
		  a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		  
		  1..........Cachorro quente..........R$4,00
		  2..........X-salada.................R$4,50
		  3..........X-bacon..................R$5,00 
		  4..........Torradas Simples.........R$2,00 
		  5..........Refrigerante.............R$1,50
		 */

		Scanner sc = new Scanner(System.in);
		double total;

		System.out.println("Digite o código e um produto:");
		int cod = sc.nextInt();

		System.out.println("Digite a quantidade deste produto escolhido:");
		int qtd = sc.nextInt();

		switch (cod) {
		case 1:
			total = (double) 4.0 * qtd;
			System.out.printf("Total: %.2f", total);
			break;
		case 2:
			total = (double) 4.5 * qtd;
			System.out.printf("Total: %.2f", total);
			break;
		case 3:
			total = (double) 5.0 * qtd;
			System.out.printf("Total: %.2f", total);
			break;
		case 4:
			total = (double) 2.0 * qtd;
			System.out.printf("Total: %.2f", total);
			break;
		case 5:
			total = (double) 1.5 * qtd;
			System.out.printf("Total: %.2f", total);
			break;
		default:
			System.out.println("Você deve digitar apenas números de 1 a 5!");
		}

	}

}
