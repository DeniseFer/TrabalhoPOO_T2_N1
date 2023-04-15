package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====MENU DE OPERAÇÕES=====");
		System.out.println("\n(1)- Somar dois numeros\n(2)- Raíz quadrada de um numero. \n");
		
		System.out.println("Digite sua opção: ");
		int menu = sc.nextInt();
		
		if (menu == 1){ //Soma dois numeros e printa
		
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		double soma= num1 + num2;
		System.out.println("===RESULTADO===");System.out.println(soma);
		}
		
		else if (menu == 2) { //Calcula raiz quadrada
			
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		
		double raiz = Math.sqrt(valor);
		System.out.println("===RESULTADO===");
		System.out.println("A raíz quadrada de "+valor+" é aproximadamente "+new DecimalFormat(".##").format(raiz));
		
		}
		else {
		System.out.println("! OPÇÃO INVÁLIDA ! Por favor, digite 1 ou 2.") ;
		}
	}}
	



