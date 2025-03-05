package com.loiane.cursojava.aula13.lab;
import java.util.Scanner;
public class Exer06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o raio do circulo: ");
		double raio = scanner.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área é aproximadamente: " + area);
	}

}
