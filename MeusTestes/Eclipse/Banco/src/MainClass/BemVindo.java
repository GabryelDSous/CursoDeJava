package MainClass;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BemVindo {

	public static void main(String[] args) {
		// Variaveis para controle
		int esc = 0;
		// Instanciando classe Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== BEM-VINDO(A) AO BANCO ==========");
		while(esc != 6) {
			System.out.println("---------------------------");
			System.out.println("1 - Criar Conta.");
			System.out.println("6 - Sair.");
			System.out.println("---------------------------");
			System.out.print("Qual sua escolha: ");
			int escolha;
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
		}
	}

}
