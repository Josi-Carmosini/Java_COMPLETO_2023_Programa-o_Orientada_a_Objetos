package Aula_29_Exercícios_sobre_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 valores com casas decimais:");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		// a) a área do triângulo retângulo que tem A por base e C por altura.
		// ********************
		double areaTriangulo = (A * C) / 2;

		// b) a área do círculo de raio C. (pi = 3.14159)
		double areaCirculo = Math.PI * Math.pow(C, 2.0);

		// c) a área do trapézio que tem A e B por bases e C por altura.
		double areaTrapezio = ((A + B) * C) / 2;

		// d) a área do quadrado que tem lado B.
		double areaQuadrado = B * B;

		// e) a área do retângulo que tem lados A e B.
		double areaRetangulo = A * B;

		System.out.println("\nSAÍDA:");
		System.out.printf("TRIÂNGULO: %.3f%n" , areaTriangulo);
		System.out.printf("CÍRCULO: %.3f%n" , areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f%n" , areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n" , areaQuadrado);
		System.out.printf("RETÂNGULO: %.3f%n" , areaRetangulo);

	}

}
