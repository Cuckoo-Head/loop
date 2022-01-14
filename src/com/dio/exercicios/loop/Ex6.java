package com.dio.exercicios.loop;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		/*
		Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
		*/
		Scanner scan = new Scanner(System.in);
		int num;
		int i;
		int multiplicacao = 1;
		
		System.out.println("Digite um número:");
		num = scan.nextInt();
		
		for(i = num; i >=1; i--) {
			multiplicacao = multiplicacao * i;
		}
			
		System.out.println(num + "! = " + multiplicacao);

	}

}
