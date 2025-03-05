package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);

		resultado++;
		System.out.println(resultado);

		// 5
		System.out.println(resultado++);
		// Mesma coisa que
		System.out.println(resultado);
		// Resultado = resultado + 1;
		// Resultado += 1;
		
		System.out.println(++resultado);
		// Mesma coisa que 
		//System.out.println(resultado);
		//resultado += 1;
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
	}

}
