package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora que INICIOU o jogo:");
		int num1  = sc.nextInt();
		
		System.out.println("Digite a hora que FINALIZOU o jogo:");
		int num2  = sc.nextInt();
		
		if (num2 > num1) {
			int horas = num2 - num1;
			System.out.printf("O JOGO DUROU %d HORA(S)",horas);
		}else {
			int horas = (24-num1)+num2;
			System.out.printf("O JOGO DUROU %d HORA(S)",horas);
		}
		
		
		
		
		
	}

}
