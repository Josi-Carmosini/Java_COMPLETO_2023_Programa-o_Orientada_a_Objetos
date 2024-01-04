package Testes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ************** EXEMPLO 1 **************************************************************
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s , which price is $ %.2f%n", product1, price1);
		System.out.printf("%s which price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n ", measure);

		// ************** EXEMPLO 2 - Para ler um texto ATÉ A QUEBRA DE LINHA*************************************************************
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		System.out.println("\n\nDIGITE 3 STRINGS:");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		// ************** EXEMPLO 3 - Quebra de linha pendente*************************************************************
		int x;
		String s4, s5, s6;
		
		System.out.println("\n\nDIGITE 1 int e 3 STRINGS:");
		x = sc.nextInt(); // após um nextInt o scanner le o "pulo de linha" e armazena o vazio na memória
		sc.nextLine(); // para resolver é necessário armazenar esse vazio em algum lugar
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		sc.close();
		
	}

}
