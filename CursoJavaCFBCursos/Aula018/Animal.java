public class Animal implements SerVivo{

    public boolean vivo = true;

    public Animal(){

    }

    @Override
    public void mover() {
        
    }

    @Override
    public void comer(int massa) {
        
    }

    @Override
    public void info() {
        System.out.printf("Vivo: %s", this.vivo? "Sim":"Nao");
    }
    
}