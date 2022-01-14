package com.dio.exercicios.loop;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que peça N números inteiros,
		calcule e mostre a quantidade de números pares
		e a quantidade de números impares.
		*/
		Scanner scan = new Scanner(System.in);
		
		int num;
		int numTentativa;
		int numPar = 0;
		int numImpar = 0;
		int i = 0;
		
		System.out.println("Digite o número de tentativas:");
		numTentativa = scan.nextInt();
		
		while(i < numTentativa) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) numPar++;
			else numImpar++;
			
			i++;
		}
		 System.out.println("Você digitou " + numPar + " número(s) par(es) e " + numImpar + " número(s) ímpar(es)");
	}

}
