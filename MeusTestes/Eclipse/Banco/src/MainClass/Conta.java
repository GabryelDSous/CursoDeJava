package MainClass;
import java.util.Scanner;
import java.util.ArrayList;
public class Conta implements Funcoes{
	// Verificardor de nome
	Verificador verificador = new Verificador();
	
	// ArrayLists
	private ArrayList<String> NomeUsuario = new ArrayList<String>();
	private ArrayList<Short> AnoNascimento = new ArrayList<>();
	// Scanner
	private Scanner scanner = new Scanner(System.in);
	
	// Variaveis
	private String nome;
	private short anoNasc;
	private int senha;

	// Metodos getters e setters
	private String getNome() {
		return nome;
	}

	private void setNome() {
		this.nome = verificador.VerificarNome();
	}
	
	private short getAnoNasc() {
		return anoNasc;
	}

	private void setAnoNasc() {
		this.anoNasc = verificador.VerificarIdade();
	}

	private int getSenha() {
		return senha;
	}

	private void setSenha() {
		this.senha = verificador.VerificarSenha();
	}

	// Metodo Criar conta
	@Override
	public void CriarConta() {
		System.out.println("----------- VAMOS CRIAR SUA CONTA -----------");
		System.out.print("Qual é o seu nome: ");
		this.setNome();
		System.out.print("Qual o ano do seu nascimento: ");
		this.setAnoNasc();
		System.out.print("Informe uma senha: ");
		this.setSenha();
	}
	
	
}
