package MainClass;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BemVindo {

	public static void main(String[] args) {
		// Instanciando Conta
		Conta Conta = new Conta();
		
		// Variaveis para controle
		int esc = 0;
		// Instanciando classe Scanner
		Scanner scanner = new Scanner(System.in);
		// Instanciando Classe verificador
		Verificador Verificar = new Verificador();
		System.out.println("========== BEM-VINDO(A) AO BANCO ==========");
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1 - Criar Conta.");
			System.out.println("6 - Sair.");
			System.out.println("---------------------------");
			System.out.print("Qual sua escolha: ");
			int escolha = Verificar.VerificarComLimite();
			esc = escolha;
			
			
			// Funções
			if(escolha == 1) Conta.CriarConta();;
			if(escolha == 6) break;
		}
		
	}

}
