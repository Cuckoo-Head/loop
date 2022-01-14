package com.dio.exercicios.loop;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		String mensagem;
		
		System.out.println("Digite a nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida, digite novamente:");
			nota = scan.nextInt();
		}
	}

}
