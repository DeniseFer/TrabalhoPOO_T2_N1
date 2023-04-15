package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_min = 0.0;
		char turno = ' ';
		char categ = ' ';
		int hora_mensal = 0;
		double coeficiente = 0.0;
		double sal_bruto = 0.0;
		double imposto = 0.0;
		int gratif = 0;
		double auxilio_alim;
		double sal_liquido = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salário mínimo:\n");
		sal_min = sc.nextDouble();
		
		System.out.println("Digite o número de horas mensais trabalhadas: \n");
		hora_mensal = sc.nextInt();
		
		System.out.println("===TURNO DE TRABALHO===");
		System.out.println("(M) - Matutino\n(V) - Vespertino\n(N) - Noturno\n");
		System.out.println("Digite a letra (em maiúsculo) que representa seu turno:\n");
		turno = sc.next().toUpperCase().charAt(0);
		
		// CATEGORIA
		
		System.out.println("===CATEGORIA===");
		System.out.println("(O) - Operário\n(G) - Gerente\n");
		System.out.println("Digite a letra (em maiúsculo) que representa sua categoria:\n");
		categ = sc.next().toUpperCase().charAt(0);
						
		
				
		// COEFICIENTE
		
		
		
		if (turno == 'M') {
			System.out.println("===COEFICIENTE===");
			coeficiente = 0.10 * sal_min;
			System.out.println("O coeficiente do salário mínimo é de R$"+ new DecimalFormat(".##").format(coeficiente));
		}
		else if (turno == 'V') {
			System.out.println("===COEFICIENTE===");
			coeficiente = 0.15 * sal_min;
			System.out.println("O coeficiente do salário mínimo é de R$"+ new DecimalFormat(".##").format(coeficiente));
			
		}
		else if (turno == 'N') {
			System.out.println("===COEFICIENTE===");
			coeficiente = 0.12 * sal_min;
			System.out.println("O coeficiente do salário mínimo é de R$"+ new DecimalFormat(".##").format(coeficiente));
			
		}
		else {
			System.out.println("Digite dados válidos!");
			System.exit(0);
		}
		
		// SALÁRIO BRUTO
		
		System.out.println("\n===SALÁRIO BRUTO===");
		sal_bruto = coeficiente * hora_mensal;
		System.out.println("O salário bruto será de R$"+ new DecimalFormat(".##").format(sal_bruto));
		
		
		// IMPOSTO
		
		
		if (categ == 'O') {
			
			if(sal_bruto >= 300) {
				System.out.println("\n===IMPOSTO===");
				imposto = 0.05 * sal_bruto;
				System.out.println("O imposto será de R$"+ new DecimalFormat(".##").format(imposto));
				
			}
			else if(sal_bruto < 300) {
				System.out.println("\n===IMPOSTO===");
				imposto = 0.03 * sal_bruto;
				System.out.println("O imposto será de R$"+ new DecimalFormat(".##").format(imposto));
				
			}
			
		}
		else if(categ == 'G') {
			if(sal_bruto >= 400) {
				System.out.println("\n===IMPOSTO===");
				imposto = 0.06 * sal_bruto;
				System.out.println("O imposto será de R$"+ new DecimalFormat(".##").format(imposto));
			}
			else if(sal_bruto < 400){
				System.out.println("\n===IMPOSTO===");
				imposto = 0.04 * sal_bruto;
				System.out.println("O imposto será de R$"+ new DecimalFormat(".##").format(imposto));
			}
			
		}
		else {
			System.out.println("\nDigite dados válidos em categoria!");
			System.exit(0);
		}
		
		// GRATIFICAÇÃO
		
		System.out.println("\n===GRATIFICAÇÃO===");
		
		if((turno == 'N') & (hora_mensal > 80)) {
			gratif = 50;
			System.out.println("A gratificação será de R$"+ new DecimalFormat(".##").format(gratif));
		}
		else {
			gratif = 30;
			System.out.println("A gratificação será de R$"+ new DecimalFormat(".##").format(gratif));
		}
		
		// AUXÍLIO-ALIMENTAÇÃO
		
		System.out.println("\n===AUXÍLIO ALIMENTAÇÃO===");
		
		if((categ == 'O') | (coeficiente <=25)) {
			auxilio_alim =  sal_bruto/3;
			System.out.println("O auxílio-alimentação será de R$"+ new DecimalFormat(".##").format(auxilio_alim));
		}
		else {
			auxilio_alim =  sal_bruto/2;
			System.out.println("O auxílio-alimentação será de R$"+ new DecimalFormat(".##").format(auxilio_alim));
		}
		
		// SALÁRIO LÍQUIDO
		
		System.out.println("\n===SALÁRIO LÍQUIDO===");
		sal_liquido = sal_bruto - imposto + gratif + auxilio_alim;
		System.out.println("O salário líquido será de R$"+ new DecimalFormat(".##").format(sal_liquido));
		
		// CLASSIFICAÇÃO
		
		System.out.println("\n===CLASSIFICAÇÃO===");
		if(sal_liquido < 350) {
			System.out.println("Seu salário líquido é Mal-remunerado");
		}
		else if(sal_liquido >= 350 & sal_liquido <= 600) {
			System.out.println("Seu salário líquido é Normal");
		}
		else if(sal_liquido > 600) {
			System.out.println("Seu salário líquido é Bem-remunerado");
		}
	}

}
