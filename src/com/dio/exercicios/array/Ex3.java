package com.dio.exercicios.array;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] randomNum = new int[20];
		int num;
		int sucessor;
		
		for(int i = 0; i < 20; i++) {
	        num = random.nextInt(100);
	        randomNum[i] = num;
		}
		
		for(int count = 0; count < 20; count++) {
			sucessor = randomNum[count] + 1;
			System.out.println("randomNum[" + count + "]: " + randomNum[count] + ", " + sucessor);
		}
	}

}
