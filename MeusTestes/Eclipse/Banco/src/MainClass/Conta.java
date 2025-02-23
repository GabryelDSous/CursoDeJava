package MainClass;
import java.util.Scanner;
import java.util.ArrayList;
public class Conta implements Funcoes{
	// Verificardor de nome
	Verificador verificador = new Verificador();
	
	// ArrayLists
	private ArrayList<String> NomeUsuario = new ArrayList<String>();
	
	// Scanner
	private Scanner scanner = new Scanner(System.in);
	
	// Variaveis
	private String nome;

	// Metodos getters e setters
	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		verficiarNome:
		while(true) {
			if(nome.matches("[\\p{L}]+")) {
				this.nome = nome;
				break verficiarNome;
			} else {
				//scanner.nextLine();
				System.out.print("Seu nome não deve conter números: ");
			}
		}
		
	}
	
	// Metodo Criar conta
	@Override
	public void CriarConta() {
		System.out.println("----------- VAMOS CRIAR SUA CONTA -----------");
		System.out.print("Qual é o seu nome: ");
		this.setNome(scanner.nextLine());
	}
	
	
}
