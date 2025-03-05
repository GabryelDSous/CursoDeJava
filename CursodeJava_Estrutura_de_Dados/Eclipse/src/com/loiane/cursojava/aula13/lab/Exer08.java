package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o valor da sua hora trabalhada: R$");
		double vHora = scanner.nextDouble();
		System.out.print("Quantas horas você trabalha no mês: ");
		int hTrabalhada = scanner.nextInt();
		
		System.out.println("No total você ganha R$" + vHora*hTrabalhada + " por mês.");
	}

}
