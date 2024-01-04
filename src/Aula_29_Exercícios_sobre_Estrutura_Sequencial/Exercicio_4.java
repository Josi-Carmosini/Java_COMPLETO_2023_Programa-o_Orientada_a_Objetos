package Aula_29_Exercícios_sobre_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		/*
		  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		  o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número 
		  e o salário do funcionário, com duas casas decimais.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite o número do funcionário:");
		int num = sc.nextInt();
		
		System.out.println("\nDigite seu número de horas trabalhadas:");
		int horas = sc.nextInt();
		
		System.out.println("\nDigite o o valor que recebe por hora:");
		double valor = sc.nextDouble();
		
		double salario = (double)horas*valor;
		
		System.out.printf("\nO salário do funcionário %d é: R$%.2f", num, salario);
		
	}

}
