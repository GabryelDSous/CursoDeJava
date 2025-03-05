package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora: ");
		double ganhoPHora = scanner.nextDouble();
		System.out.print("Quantas horas trabalhada no mês: ");
		int horaPMes = scanner.nextInt();
		
		double salBruto = ganhoPHora * horaPMes;
		double inss = salBruto * 8 / 100;
		double sindicato = salBruto * 5 / 100;
		double impostoRenda = salBruto * 11/100;
		double totalDesc = inss + sindicato + impostoRenda;
		double salLiq = salBruto - totalDesc;
		
		System.out.printf("Salario bruto: %.2f\n", salBruto);
		System.out.printf("INSS: %.2f\n", inss);
		System.out.printf("Sindicato: %.2f\n", sindicato);
		System.out.printf("Imposto de renda: %.2f\n", impostoRenda);
		System.out.printf("Total de descontos: %.2f\n", totalDesc);
		System.out.printf("Salário líquido: %.2f\n", salLiq);
		

	}

}
