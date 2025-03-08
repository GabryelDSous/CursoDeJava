public class CursoJava{
    public static void main(String[] args) {
        
        int num = 0;


        Jogador j1 = new Jogador(num++);
        Jogador j2 = new Jogador(num++);
        Jogador j3 = new Jogador(num++);

        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        System.out.printf("%nVidas do jogador 1: %d",j1.getVidas());
        System.out.printf("%nVidas do jogador 2: %d",j2.getVidas());
        System.out.printf("%nVidas do jogador 3: %d",j3.getVidas());

        // j1.num = 10;
        // j2.num = 5;

        // System.out.printf("%n%d", j1.num);
        // System.out.printf("%n%d", j2.num);
    }
}