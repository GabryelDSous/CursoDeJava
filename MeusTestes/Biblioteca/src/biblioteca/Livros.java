package biblioteca;
public class Livros {
    private String nomeLivro;
    private String nomeAutor;
    private short dataPub;
    private boolean emprestado;
    public Livros(String nomeLivro, String nomeAutor, short dataPub){
        this.emprestado = false;
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.dataPub = dataPub;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public short getDataPub() {
        return dataPub;
    }

    public void setDataPub(short dataPub) {
        this.dataPub = dataPub;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    public String toString(){
        return this.nomeLivro + " (Emprestado: "+(this.emprestado?"Sim":"Não")+")";
    }
}
