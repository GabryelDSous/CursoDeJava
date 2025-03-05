package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe uma media em metros: ");
		double metros = scanner.nextDouble();
		
		System.out.println("Convertendo " + metros + "m para centimetros: " + (metros*100));

	}

}
