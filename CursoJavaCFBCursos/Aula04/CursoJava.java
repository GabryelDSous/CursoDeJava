import java.util.Scanner;
public class CursoJava{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
        final int MEDIA = 60;
        String nome = "", res = "";
        
        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3 = scanner.nextInt();
        System.out.print("Digite a quarta nota: ");
        n4 = scanner.nextInt();

        soma = n1 + n2 + n3 + n4;
        if(soma >= MEDIA) res = "APROVADO";
        else if(soma >= 40) res = "RECUPERACAO";
        else res = "REPROVADO";

        System.out.printf("Aluno %s foi %s, com nota %d", nome, res, soma);
    }
}