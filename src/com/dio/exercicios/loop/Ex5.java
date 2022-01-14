package com.dio.exercicios.loop;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/*
		Desenvolva um gerador de tabuada,
		capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
		O usuário deve informar de qual numero ele deseja ver a tabuada.
		A saída deve ser conforme o exemplo abaixo:
		Tabuada de 5:
		5 X 1 = 5
		5 X 2 = 10
		...
		5 X 10 = 50
		*/
		Scanner scan = new Scanner(System.in);
		
		int num;
		int resultado;
		
		int i = 1;
		System.out.println("Digite um número:");
		num = scan.nextInt();
		
		while(i <= 10) {
			resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);
			i++;
		}
	}

}
