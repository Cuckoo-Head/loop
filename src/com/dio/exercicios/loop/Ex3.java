package com.dio.exercicios.loop;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que leia 5 números
		e informe o maior número
		e a média desses números.
		*/
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int maior = -2147483648;
		int soma = 0;
		int i = 0;
		
		do {
			System.out.println("Digite um número:");
			numero = scan.nextInt();
			
			soma += numero;
			
			if(numero > maior) maior = numero;
			i++;
		} while (i <= 4);
		
		int media = soma/5;
		
		System.out.println("A média é " + media + ", o maior é " + maior);
	}

}
