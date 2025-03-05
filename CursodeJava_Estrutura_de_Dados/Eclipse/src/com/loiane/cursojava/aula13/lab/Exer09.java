package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit : ");
		double tempF = scanner.nextDouble();
		
		double tempC = (tempF - 32) / 1.8;
		
		System.out.printf("%.1f°F em graus Celsius é %.1f\n", tempF, tempC);

	}

}
