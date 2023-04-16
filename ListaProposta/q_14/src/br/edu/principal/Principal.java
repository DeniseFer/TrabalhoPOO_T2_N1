package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// (14 - lista proposta) PROGRAMA QUE CALCULA SALARIO DE UM FUNCIONARIO COM AUMENTO.
		
	System.out.println("Digite o salário do funcionario: ");
	double salario = sc.nextDouble();
	double aumento = 0.0;
	
	if (salario <= 300) {
		aumento = salario * 1.5;
		} 
	else if (salario > 300 & salario <= 500) {
		aumento = salario * 1.4;
		} 
	else if (salario > 500 & salario <= 700) {
		aumento = salario * 1.3;
		} 
	else if (salario > 700 & salario <= 800) {
		aumento = salario * 1.2;
		} 
	else if (salario > 800 & salario <= 1000) {
		aumento = salario * 1.1; 
		} 
	else if (salario > 1000){
		aumento = salario * 1.05; 
		}
	System.out.println("=====RESULTADO=====");
	System.out.println("O novo salário terá um valor de: " + aumento + " reais.");}} 