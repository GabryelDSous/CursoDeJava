public class Aviao extends Veiculo{
    private int categoria;

    public Aviao(String nome, int categoria){
        super(nome, 10);
        this.categoria = categoria;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Categoria: %s%n", this.categoria);
    }
}
