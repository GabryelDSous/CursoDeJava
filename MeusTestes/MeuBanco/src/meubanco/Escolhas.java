package meubanco;
// Importação
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
// Inicio Classe
public class Escolhas {
    // Variaveis
    byte escolha;
    short anoNasc;
    byte tipo;
    String nome;
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
                    System.out.print("Qual tipo da conta\n[1]Polpança\n[2]Corrente\nTIPO: ");
                    this.setTipo(scanner.nextByte());
                    for(boolean loop = true; loop == true;){
                        if(this.getTipo() == 1 || this.getTipo() == 2){
                            System.out.println("É um numero");
                        } else{
                            System.out.println("Não é um número");
                        }
                    }
                }
                
            
            
            
//            conta.setNome(nome);
//            conta.setAnoNasc(anoNasc);
//            Abanco.add(conta);
            }
        }
    }
}