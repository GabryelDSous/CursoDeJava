package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celcius: ");
		double tempC = scanner.nextDouble();
		
		double tempF = (tempC * 1.8) + 32;
		
		System.out.printf("Convertendo %.1f°C para Fahrenheit fica %.1f°F", tempC, tempF);
	}

}
