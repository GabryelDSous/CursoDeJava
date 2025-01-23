package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Biblioteca!\n");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livros> livro = new ArrayList<>(); 
        byte escolha = 0;
        while(escolha != 6){
            
            System.out.println("\n1. Adicionar um novo livro");
            System.out.println("2. Exibir todos os livros");
            System.out.println("3. Emprestar um livro");
            System.out.println("4. Devolver um livro");
            System.out.println("5. Exibir informações de um livro");
            System.out.println("6. Sair");
            System.out.print("\nEscolha uma opção: ");
            while(!scanner.hasNextByte()){
                scanner.nextLine();
                System.out.print("Selecione através do menu numérico: ");                
            }
            escolha = scanner.nextByte();
            scanner.nextLine();
            if(escolha == 1){
                System.out.println("Adicionar o livro.");
                System.out.print("Digite o título do livro: ");
                String nomeLivro = scanner.nextLine();
                System.out.print("Digite o autor: ");
                String nomeAutor = scanner.nextLine();
                System.out.print("Digite o ano de publicação: ");
                short dataPub = scanner.nextShort();
                livro.add(new Livros(nomeLivro,nomeAutor, dataPub));
                System.out.println("Livro adicionado com sucesso!");
            } else if(escolha == 2){
                for(int cc = 0; cc < livro.size(); cc++){
                    System.out.println((cc+1) + " - " + livro.get(cc));
                }
            } else if(escolha == 3){
                System.out.print("Digite o número do livro que deseja emprestar: ");
                short indice = scanner.nextShort();
                if(livro.get(indice - 1).isEmprestado() == false){
                    livro.get(indice - 1).setEmprestado(true);
                    System.out.println("Livro \"" + livro.get(indice - 1).getNomeLivro() + "\" emprestado com sucesso!");
                } else System.out.println("Livro \"" + livro.get(indice - 1).getNomeLivro() + "\" não esta disponível por enquanto.");
            } else if(escolha == 4){
                livro.forEach(emprestado -> {
                    if(emprestado.isEmprestado() == true){
                        System.out.println("Livros emprestados:");
                        short a = 0;
                        ++a;
                        System.out.println(a + " - " + emprestado.getNomeLivro());
                        System.out.print("\nDigite o número do livro que deseja devolver: ");
                        short numDev = scanner.nextShort();
                        if(numDev < 1 || numDev > a){
                            System.out.print("Selecione o número do livro: ");
                            numDev = scanner.nextShort();
                        } else{
                            emprestado.setEmprestado(false);
                            System.out.println("Livro \"" + emprestado.getNomeLivro() + "\" devolvido com Sucesso");
                        }
                    } else System.out.println("Nenhum livro emprestado");
                });
            } else if(escolha == 5){
                System.out.print("Digite o número do livro que deseja visualizar: ");
                short indice = scanner.nextShort();
                System.out.println("Título: " + livro.get(indice - 1).getNomeLivro());
                System.out.println("Autor: " + livro.get(indice - 1).getNomeAutor());
                System.out.println("Ano de publicação: " + livro.get(indice - 1).getDataPub());
            }
        }
        System.out.println("Volte sempre!");
    }
}