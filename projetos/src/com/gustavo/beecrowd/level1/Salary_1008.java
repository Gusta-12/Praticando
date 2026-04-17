package com.gustavo.beecrowd.level1;

import java.util.Locale;
import java.util.Scanner;

public class Salary_1008 {
	// Problema: Escreve um programa que receba: o número de um funcionário, a
	// quantidade de horas trabalhadas e o valor que recebe por hora.
	// Exibir o número e o salário do funcionário.
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int workedHours = sc.nextInt();
		double ratePerHour = sc.nextDouble();
		
		double salary = ratePerHour * workedHours;
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", salary));
		
		sc.close();
	}

}
