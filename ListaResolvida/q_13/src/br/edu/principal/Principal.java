package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		double sal = 0.0;
		double imp = 0.0;
		double aum = 0.0;
		double novo_sal = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======= MENU DE OPÇÕES =======");
		System.out.println("1. IMPOSTO");
		System.out.println("2. NOVO SALÁRIO");
		System.out.println("3. CLASSIFICAÇÃO");
		
		System.out.println("\n- DIGITE A OPÇÃO DESEJADA:\n");
		op = sc.nextInt();
		
		if (op == 1) { //Receber salário e calcular e mostrar imposto
			System.out.println("=========CÁLCULO DE IMPOSTO=======");
			System.out.println("Digite o valor de seu salário:\n");
			sal = sc.nextDouble();
			
			if(sal < 500) {
				imp = sal * 5/100;
				System.out.println("O imposto será de: R$"+new DecimalFormat(".##").format(imp));
			}
			else if (sal >= 500 & sal <= 850) {
				imp = sal * 10/100;
				System.out.println("O imposto será de: R$"+new DecimalFormat(".##").format(imp));
			}
			else if(sal > 850) {
				imp = sal * 15/100;
				System.out.println("O imposto será de: R$"+ new DecimalFormat(".##").format(imp));
			}
			
		}
		
		
		if (op == 2) { // Receber salário e calcular e mostrar o novo salário!!!
			System.out.println("==========CÁLCULO DE SALÁRIO=========");
			System.out.println("Digite o valor de seu salário:\n");
			sal = sc.nextDouble();
			
			if(sal > 1500) {
				aum =  25;
				
			}
			else if ((sal >= 750) & (sal <= 1500)) {
				aum = 50;
				
			}
			else if((sal >= 450) & (sal < 750)) {
				aum = 75;
			}
			else if(sal < 450) {
				aum = 100;	
			}
			
			novo_sal = sal + aum;
			System.out.println("O novo salário será de: R$"+ new DecimalFormat(".##").format(novo_sal));
			
		}
		
		if (op == 3) {
			System.out.println("==========CLASSIFICAÇÃO DE SALÁRIO==========");
			System.out.println("Digite o valor de seu salário:\n");
			sal = sc.nextDouble();
			
			if(sal >= 700) {
				System.out.println("Seu salário é Bem-remunerado.");
			}
			else if (sal < 700) {
				System.out.println("Seu salário é Mal-remunerado.");

			}
			
			
		}
		
		if ((op < 1) & (op > 3)) {
			
			System.out.println("Opção inválida.");
		}
		
		
		
		
		
		
	}}

