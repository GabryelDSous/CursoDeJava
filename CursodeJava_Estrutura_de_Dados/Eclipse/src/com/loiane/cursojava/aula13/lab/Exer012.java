package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual sua sua altura em metros: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.printf("Seu peso ideal é %.2fkg", pesoIdeal);
	}

}
