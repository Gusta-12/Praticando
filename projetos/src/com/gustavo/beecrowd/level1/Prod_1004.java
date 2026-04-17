package com.gustavo.beecrowd.level1;

import java.util.Scanner;

public class Prod_1004 {
	// Problema: calcular o produto de dois valores
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int prod = x * y;
		
		System.out.println("PROD = " + prod);
		
		sc.close();
	}
}
