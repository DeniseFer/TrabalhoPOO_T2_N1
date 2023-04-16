package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite o valor do produto desejado: ");
	double preçoProduto = sc.nextDouble();
		
	System.out.println("Digite o código do produto desejado: ");
	double codProd = sc.nextDouble();
		
	double desconto = 0;
	
	if (preçoProduto <= 30){
		desconto = 0;
	}
	else if (preçoProduto > 30 & preçoProduto <= 100 ){
		desconto = preçoProduto * 0.1;
		}
	else if (preçoProduto > 100){
		desconto = preçoProduto * 0.15;
		}
	
	double preçoComDesconto = preçoProduto - desconto;
	System.out.println("=====RESULTADOS=====");
	System.out.println("O preço atual do produto é: R$" + preçoProduto);
	System.out.println("O valor do desconto é: " + desconto);
	System.out.println("O preço do produto com desconto é: R$" + preçoComDesconto);}} 
