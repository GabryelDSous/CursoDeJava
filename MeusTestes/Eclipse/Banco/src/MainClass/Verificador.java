package MainClass;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Verificador {
	private int escolha;
	private int esc;
	
	// Metodo principal
	public int Verificar() {
		Scanner scanner = new Scanner(System.in);
		lEscolha:
			while(true) {
				try {
					escolha = scanner.nextInt();
					if(escolha < 1 || escolha > 6) {
						scanner.nextLine();
						System.out.print("Escolha um número do menu: ");
					} else {
						esc = escolha;
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
}
