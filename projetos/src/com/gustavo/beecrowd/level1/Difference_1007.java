package com.gustavo.beecrowd.level1;

import java.util.Scanner;

public class Difference_1007 {
	// Problema: leia quatro valores inteiros e calcule a diferença do produto de A
	// e B pelo produto de C e D
	// Formula: DIFERENCA = (A * B - C * D)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int difference = a * b - c * d;
		
		System.out.println("DIFERENCA = " + difference);
		
		sc.close();

	}

}
