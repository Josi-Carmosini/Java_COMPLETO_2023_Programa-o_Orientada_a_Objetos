package Aula_29_Exercícios_sobre_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		// entrada de dados **********************************************************
		
		System.out.println("Digite o código da peça 1:");
		String cod1 = (sc.nextLine());
		
		System.out.println("Digite a quantidade da peça 1:");
		int qtd1 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da peça 1:");
		double valorUni1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Digite o código da peça 2:");
		String cod2 = sc.nextLine();
		
		System.out.println("Digite a quantidade da peça 2:");
		int qtd2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da peça 2:");
		double valorUni2 = sc.nextDouble();
		
		// valor a ser pago pelo cliente ***************************************************
		
		double valorPeca1 = (double)qtd1*valorUni1;
		double valorPeca2 = (double)qtd2*valorUni2;
		
		System.out.printf("O valor total a ser pago pelas peças de código '%s' e de código '%s' é: R$%.2f", cod1, cod2,valorPeca1+valorPeca2);
		
	}

}
