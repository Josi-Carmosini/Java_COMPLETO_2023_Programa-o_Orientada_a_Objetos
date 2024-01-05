package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
			que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
			qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
			Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
			mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

			RENDA                                             IMPOSTO DE RENDA
			De 0.0 ATÉ R$2000.00.............................      ISENTO
			DE R$2000.01 ATÉ R$3000.00.......................        8%
			DE R$3000.01 ATÉ R$4500.00 ......................       18%
			ACIMA DE R$4500.00 ..............................       28%
			
			Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
			salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
			de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
			duas casas decimais.
			
		 */

		Scanner sc = new Scanner(System.in);
		double imposto;

		System.out.println("Informe o salário (com duas casas decimais):");
		double salario = sc.nextDouble();
		
		if(salario<=2000.00){
			System.out.println("ISENTO");
		}else if(salario>2000.00 && salario<=3000.00) {
			imposto = (salario-2000.00)*0.08;
			System.out.printf("IMPOSTO: R$%.2f", imposto);
		}else if(salario>3000.00 && salario<=4500.00) {
			imposto = (1000*0.08)+((salario-3000.00)*0.18);
			System.out.printf("IMPOSTO: R$%.2f", imposto);
		}else {
			imposto = (1000*0.08)+(1500*0.18)+((salario-4500.00)*0.28);
			System.out.printf("IMPOSTO: R$%.2f", imposto);
		}
		
		
		
		
		
	}

}
