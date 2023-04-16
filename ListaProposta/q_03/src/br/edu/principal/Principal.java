package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//(3 - lista proposta) PROGRAMA QUE MOSTRA O MENOR DE DOIS NUMEROS DIGITADOS. 
		
	System.out.println("Digite o primeiro número: ");
	double num1 = sc.nextDouble();
	System.out.println("Digite o segundo número: ");
	double num2 = sc.nextDouble();
	
	if (num1 > num2 ){
		System.out.println("O menor número é "+ num2);}
	else {
		System.out.println("O menor número é "+ num1);
	}}} 