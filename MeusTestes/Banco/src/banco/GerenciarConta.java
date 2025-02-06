package banco;
public class GerenciarConta{
    private String nome;
    private short idade;
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public GerenciarConta(String nome, short idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
