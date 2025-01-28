package meubanco;
// Importação
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Random;
// Inicio Classe
public class Escolhas {
    // Variaveis
    byte escolha;
    short anoNasc;
    String nome;
    int numConta;
    // Fechar programa para menores de 18
    boolean fechar = false;
    // Construtor
    public Escolhas(byte escolha) {
        this.escolha = escolha;
    }
    // Getter and Setter Escolha que vem da clase MeuBanco
    private byte getEscolha() {
        return escolha;
    }

    public void setEscolha(byte escolha) {
        this.escolha = escolha;
    }
    
    public boolean getFechar(){
        return this.fechar;
    }
    public void setFechar(boolean fechar){
        this.fechar = fechar;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public short getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(short anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Instanciando o scanner, ArrayList e o Ano
    Scanner scanner = new Scanner(System.in);
    ArrayList<TiposContas> Abanco = new ArrayList<TiposContas>();
    LocalDateTime timer = LocalDateTime.now();
    int ano = timer.getYear();
    
    // Metodo de operar as escolhas
    public void Escolhas(){
        while(!this.getFechar()){
            // Forma limitar o Line() apenas a letras
            String regex = "^[a-zA-Z\\s]+$";
            // Criando a conta
                System.out.println("--------------------------");
                System.out.println("Vamos abrir uma nova conta!");
            while(getEscolha() == 1){
                // Capturando o nome
                System.out.print("Qual é o seu nome: ");
                nome = scanner.nextLine();
                // Verificando o nome
                for(boolean loop = true; loop == true;){
                    if(nome.matches(regex))loop = false;
                    else {
                        System.out.print("O nome deve conter apenas letras, e sem caracteres acentuados: ");
                        nome = scanner.nextLine();
                    }
                }
                // Pegando o ano
                System.out.print("Qual seu ano de nascimento: ");
                // Verificando se a entrada possui apenas numeros
                for(boolean loop = true; loop == true;){
                    if(scanner.hasNextShort()){
                        anoNasc = scanner.nextShort();
                        // Verificando se a pessoa é maior de 18 anos
                        int idade = ano-anoNasc;
                        if(idade > 17){
                            loop = false;
                        } else{
                            System.out.printf("Infelizmente você tem apenas %d e não pode abrir uma conta.", idade);
                            this.setFechar(true);
                        break;
                        }
                    } else{
                        System.out.print("Informe apenas o ano de seu nascimento: ");
                        scanner.nextLine();
                    }
                }
                if(this.getFechar()) break;
                else{
                    Random random = new Random();
                    int numRandom = random.nextInt(1000) + 1;
                    this.setNumConta(numRandom);
                }
                ArrayList<TiposContas> Contas = new ArrayList<TiposContas>();
                Contas.add(this.getNome());
            }
        }
    }
}