package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//(12 - lista proposta) PROGRAMA QUE CALCULA SALARIO DE UM FUNCIONARIO.
	System.out.println("Digite o salário do funcionário: ");
	double salario = sc.nextDouble();
	double gratificação = 0.0;
	double imposto = 0.0;
	
	if (salario <=350 ){
		gratificação = 100;
	    }
	else if (salario > 350 & salario <=600){
		gratificação = 75;
		}
	else if (salario > 600 & salario <= 900 ){
		gratificação = 50;
		}
	else if(salario > 900){
		gratificação = 35;
		}
	
	imposto = salario * 0.07;
	double total = salario + gratificação - imposto;
	
	System.out.println("O valor total do salário do funcionário é: "+new DecimalFormat(".##").format(total)+" reais.");
	
	}}