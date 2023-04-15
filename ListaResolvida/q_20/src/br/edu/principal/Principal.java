package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double PesoQuilos = 0.0;
	double PesoGramas = 0.0;
	
	System.out.println("Digite o código do produto (1 a 10)");
	int produto = sc.nextInt();
	System.out.println("Digite o código do país do produto (1 a 3)");
	int país = sc.nextInt();
	System.out.println("Digite a quantidade em quilo do produto: ");
	double quilo = sc.nextDouble();
	double PreçoGramas = 0.0;
	
	if (produto >= 1 && produto <= 4) {
		PreçoGramas = 10;
		} 
	else if (produto >= 5 && produto <= 7) {
		PreçoGramas = 25;
		} 
	else if (produto >= 8 && produto <= 10) {
		PreçoGramas = 35;
		} 
	else {System.out.println("Escolha opções válidas."); 
	}
	
	PesoGramas = quilo * 1000;
	
	double PreçoTotal = PesoGramas * PreçoGramas;
	System.out.println("\n===PESO EM GRAMAS===");
	System.out.println("O peso do produto em gramas é: "+ PesoGramas +" gramas\n");
	System.out.println("===PREÇO SEM IMPOSTO===");
	System.out.println("O preço do produto em gramas é: R$" + PreçoTotal+"\n");
	
	
	double imposto = 0.0;
	
	if (país == 1) {
		imposto = 0;
		System.out.println("===IMPOSTO===");
		System.out.println("O valor do imposto será de "+ imposto + " reais");
	} 
	else if (país == 2) {
		imposto = PreçoTotal * 0.15;
		System.out.println("===IMPOSTO===");
		System.out.println("O valor do imposto será de "+ imposto + " reais");
		} 
	else if (país == 3) {
		imposto = PreçoTotal * 0.25;
		System.out.println("===IMPOSTO===");
		System.out.println("O valor do imposto será de "+ imposto + " reais");
		} 
	else {
		System.out.println("Escolha uma opção válida"); }
	
	double ValorTotal = PreçoTotal + imposto;
	System.out.println("\n===PREÇO COM IMPOSTO===");
	System.out.println("O valor total do produto será: " + ValorTotal + " reais.");
	}}