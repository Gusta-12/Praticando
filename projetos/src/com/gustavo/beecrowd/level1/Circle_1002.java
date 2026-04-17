package com.gustavo.beecrowd.level1;

import java.util.Locale;
import java.util.Scanner;

public class Circle_1002 {
	// Problema: calcular a área de um círculo.
	// Considerar n = 3.14159 (PI)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double n = 3.14159;
		double area = n * Math.pow(radius, 2);
		
		System.out.println("A = " + String.format("%.4f", area));
		
		sc.close();
	}
}
