package com.loiane.cursojava.aula13.lab;

import java.util.Scanner;

public class Exer014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o tamanho do arquivo em MB: ");
		int MB = scanner.nextInt();
		System.out.print("Qual a velocidade da sua internet em Mbps: ");
		int Mbps = scanner.nextInt();
		
		// transformando Mbps para MBps
		int RealMB = Mbps * 8;
		
		double tempo = MB / (double) RealMB;
		
		System.out.printf("Para baixar um arquivo de %dMB você precisará de %.2f minutos", MB, tempo);

	}

}
