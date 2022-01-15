package com.dio.exercicios.array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arrayChar = new String[6];
		String caractere;
		int i = 0;
		int count = 0;
		int qtdConsoante = 0;
		
		while(i < arrayChar.length) {
			System.out.println("Digite um caractere:");
			caractere = scan.nextLine();
			
			if(!(caractere.equalsIgnoreCase("a") |
			caractere.equalsIgnoreCase("e") |
			caractere.equalsIgnoreCase("i") |
			caractere.equalsIgnoreCase("o") |
			caractere.equalsIgnoreCase("u"))) {
				qtdConsoante++;
				arrayChar[i] = caractere;
			}
			i++;
		}
		
		System.out.println("Foram lidas " + qtdConsoante + " consoantes.");
		while(count < arrayChar.length) {
			if (arrayChar[count] != null) System.out.println("arrayChar[" + count + "]: " + arrayChar[count]);
			count++;
		}
	}

}
