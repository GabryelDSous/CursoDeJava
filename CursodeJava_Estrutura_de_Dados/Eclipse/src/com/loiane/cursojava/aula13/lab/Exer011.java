package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Infome um número inteiro: ");
		int num1 = scanner.nextInt();
		System.out.print("Infome outro número inteiro: ");
		int num2 = scanner.nextInt();
		System.out.print("Infome um número real: ");
		double num3 = scanner.nextDouble();
		
		int respA = (num1 * 2) * (num2 / 2);
		double respB = (num1 * 3) + num3;
		double respC = Math.pow(num3, 3);
		
		System.out.println("O produto o dobro do primeiro com metade do segundo: " + respA);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + respB);
		System.out.println("O terceiro elevado ao cubo: " + respC);
	}

}
