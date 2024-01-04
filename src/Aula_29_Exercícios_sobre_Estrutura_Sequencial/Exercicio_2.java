package Aula_29_Exercícios_sobre_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/* Faça um programa para ler o valor do raio de um círculo, 
			e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo:");
		double raio = sc.nextDouble();
		
		double area = Math.PI*Math.pow(raio,2);
		
		
		System.out.printf("A área do círculo é: %.4f",area);
				
	}

}
