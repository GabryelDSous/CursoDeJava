public class CursoJava{
    public static void main(String[] args) {

        int num = 0;


        Jogador j1 = new Jogador(num++);
        Jogador j2 = new Jogador(num++);
        Jogador j3 = new Jogador(num++);

        j1.vidas = 100;

        // j1.num = 10;
        // j2.num = 5;

        // System.out.printf("%n%d", j1.num);
        // System.out.printf("%n%d", j2.num);
    }
}