package com.loiane.cursojava.aula13.lab;
import java.util.Scanner;
public class Exer04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		int nota1 = scanner.nextInt();
		System.out.print("Informe a segunda nota: ");
		int nota2 = scanner.nextInt();
		System.out.print("Informe a terceira nota: ");
		int nota3 = scanner.nextInt();
		System.out.print("Informe a quarta nota: ");
		int nota4 = scanner.nextInt();
		double media = (nota1 + nota2 + nota3 + nota4)  / 4.0;
		System.out.println("A media do aluno foi: " + media);
	}
}
