package escola;

public class Aluno {

    private String nome;
    private Mochila mochila;

    public Aluno(String nome, String cor) {
        this.nome = nome;
        this.mochila = new Mochila(cor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public void mostrarMochila(){
        System.out.println(nome + " tem uma mochila da cor " + mochila.getCor());
    }

}
