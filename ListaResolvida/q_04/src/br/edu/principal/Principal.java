package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarando e inicializando variáveis
		
		double num1 = 0.0;
		double num2 = 0.0;
		double num3 = 0.0;
		Scanner sc = new Scanner(System.in); // Objeto Scanner
		
		System.out.println("========NÚMEROS EM ORDEM CRESCENTE======\n");
		
		System.out.println("Digite o primeiro número:\n");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número:\n");
		num2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro número:\n");
		num3 = sc.nextDouble();
		
		if ((num1 < num2) & (num1 < num3)){  // num1 sendo o menor
			if(num2 < num3) {
				System.out.println("A ordem crescente é "+num1 +" - "+ num2+" - "+num3);	
			}
			else  { 
				System.out.println("A ordem crescente é "+num1 +" - "+ num3+" - "+num2);
			}
		}
		
		else if ((num2 < num1) & (num2 < num3)){ //num2 sendo o menor
			if(num1 < num3) {
				System.out.println("A ordem crescente é "+num2 +" - "+ num1+" - "+num3);	
			}
			else  { 
				System.out.println("A ordem crescente é "+num2 +" - "+ num3+" - "+num1);
			}
		}
		
		else if ((num3 < num1) & (num3 < num2)){ // num3 sendo o menor
			if(num1 < num2) {
				System.out.println("A ordem crescente é "+num3 +" - "+ num1+" - "+num2);	
			}
			else  { 
				System.out.println("A ordem crescente é "+num3 +" - "+ num2+" - "+num1);
			}
		}
		
	
		}
		
		
		
	}


