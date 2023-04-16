package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double senha;
	
	System.out.println("Digite a senha de acesso: ");
	senha = sc.nextDouble();
	
	if (senha != 4531){
		System.out.println("Acesso negado. A senha está incorreta.");
		}
	else {
		System.out.println("Acesso autorizado. Bem vindo de volta.");}}}