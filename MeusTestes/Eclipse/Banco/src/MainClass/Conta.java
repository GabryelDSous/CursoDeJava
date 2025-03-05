package MainClass;
import java.util.Scanner;
import java.util.ArrayList;
public class Conta implements Funcoes{
	// Verificardor de nome
	Verificador verificador = new Verificador();
	
	// ArrayLists
	private ArrayList<String> NomeUsuario = new ArrayList<String>();
	private ArrayList<Short> AnoNascimento = new ArrayList<>();
	private ArrayList<Integer> SuaSenha = new ArrayList<Integer>();
	private ArrayList<Integer> NumSuaConta = new ArrayList<>();
	// Scanner
	private Scanner scanner = new Scanner(System.in);
	
	// Variaveis
	private String nome;
	private short anoNasc;
	private int senha;
	private int numConta;

	

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

	private int getNumConta() {
		return numConta;
	}

	private void setNumConta() {
		this.numConta = verificador.gerarNumConta();
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
		this.setNumConta();
		System.out.println("O número da sua conta é: " + this.getNumConta());
		
		// Adicionando o nome ao array de NomeUsuario
		NomeUsuario.add(this.getNome());
		// Adicionando a idade ao array de AnoNascimento
		AnoNascimento.add(this.getAnoNasc());
		// Adicionando senha ao array de SuaSenha
		SuaSenha.add(this.getSenha());
		// Adicionando número da conta ao array de NumSuaConta
		NumSuaConta.add(this.getNumConta());
		
		System.out.println("---------------------------");
		System.out.println("Conta criada com sucesso!");
		System.out.println("Lembre-se de sua senha");
	}
	
	// Metodo para acessar conta!
	public void AcessarConta() {
		// Instanciando Objeto scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------- VAMOS ACESSAR SUA CONTA -----------");
		System.out.print("Qual o número da sua conta: ");
		int numConta = new Scanner()
		
		
	}
	
}
