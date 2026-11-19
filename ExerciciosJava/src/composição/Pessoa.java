package composição;

public class Pessoa {
    private String nome;
    private Celular celular;

    public Pessoa(String nome, String marca) {
        this.nome = nome;
        this.celular = new Celular(marca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public void mostrarCelular(){
        System.out.println(nome + " tem um celular da marca " + celular.getMarca());
    }
}
