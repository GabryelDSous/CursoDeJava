package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o lado do quadrado: ");
		double lado = scanner.nextDouble();
		double area = Math.pow(lado, 2);
		System.out.println("A area do quadrado é " + area);
		System.out.println("O dobro da área é " + area*2);
		
	}
}
