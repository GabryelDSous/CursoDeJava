package MainClass;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime;
public class Verificador {
	
	
	// esse verifica de 1 a 6
	public int VerificarComLimite() {
		Scanner scanner = new Scanner(System.in);
		int escolha;
		lEscolha:
			while(true) {
				try {
					escolha = scanner.nextInt();
					if(escolha < 1 || escolha > 6) {
						scanner.nextLine();
						System.out.print("Escolha um número do menu: ");
					} else {
						break lEscolha;
					}
					
				} catch(InputMismatchException e) {
					if(!scanner.hasNextInt()) {
						scanner.nextLine();
						System.out.print("Escolha uma opção Numérica: ");
					} else {
						escolha = scanner.nextInt();
						break lEscolha;
					}
				}
			}
		return escolha;
	}
	
	// Verificador de nomes com acentos e espaço, sem números
	public String VerificarNome() {
		Scanner scanner = new Scanner(System.in);
		String nome;
		verficiarNome:
			while(true) {
				nome = scanner.nextLine();
				if(nome.matches("[\\p{L}\\s'-]+")) break verficiarNome;
				else System.out.print("Seu nome não deve conter números: ");
			}
		return nome;
	}
	
	// Verificador de idade minimo 1900 maximo ano atual - 18 (só pode criar uma conta com 18+)
	public short VerificarIdade() {
		LocalDateTime dataAtual = LocalDateTime.now();
		Scanner scanner = new Scanner(System.in);
		short anoNasc;
		int anoAtual = dataAtual.getYear();
		while(true) {
			while(!scanner.hasNextShort()) {
				scanner.nextLine();
				System.out.print("Informe apenas seu ano de nascimento: ");
			}
			anoNasc = scanner.nextShort();
			if(anoNasc >= 1900 && anoNasc <= (anoAtual-18)) break;
			else System.out.print("Você deve ter 18 ano ou mais, Informe um ano entre 1900 e " + (anoAtual-18) + ": ");
			scanner.nextLine();
		}
		
		return anoNasc;
	}

}
