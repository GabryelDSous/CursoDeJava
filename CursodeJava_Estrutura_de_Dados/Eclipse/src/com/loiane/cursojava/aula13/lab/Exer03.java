package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = scanner.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scanner.nextInt();
		System.out.println("a soma de " + num1 + " + " + num2 + " é igual a " + (num1+num2));
		 
	}
}
