package com.gustavo.beecrowd.level1;

import java.util.Scanner;

public class Sum_1003 {
	// Problema: somar dois valores, e armazenar o resultado em uma variável 'soma'
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println("SOMA = " + sum);

		sc.close();
	}

}
