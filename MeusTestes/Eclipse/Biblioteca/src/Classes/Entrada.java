package Classes;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Entrada {
	public static void main(String[] args) {
		// Criando um objeto Scanner
		Scanner scanner = new Scanner(System.in);
		byte escolha = 1;
		System.out.println("==== BEM-VINDO(A) A NOSSA BIBLIOTECA ====");
		while(true) {
			System.out.println("----------------- MENU ------------------");
			System.out.println("1 - Ver Livros.");
			System.out.println("6 - Sair.");
			System.out.println("-----------------------------------------");
			System.out.print("Escolha uma das opções acima: ");
			// Verificando as opções
			while(true) {
				try {
					
					referencia:
					while(true) {
						escolha = scanner.nextByte();
						if(scanner.hasNextByte() && (escolha >= 1 && escolha <= 6)) {
							break referencia;
						} else {
							scanner.nextLine();
							System.out.print("Escolha uma das opções do menu: ");
						}
						//escolha = scanner.nextByte();
					}
					escolha = scanner.nextByte();
				} catch(InputMismatchException e) {
					while(true) {
						if((escolha >= 1 && escolha <= 6) && scanner.hasNextByte()) {
							break;
						} else {
							scanner.nextLine();
							System.out.print("Escolha uma das opções do menu: ");
						}
						//break;
					}
					escolha = scanner.nextByte();
				}
				scanner.nextLine();
				break;
			}
			
			
			// Saida
			if(escolha == 6) break;
		}
	}
}
