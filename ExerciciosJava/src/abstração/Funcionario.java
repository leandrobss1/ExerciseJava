package abstração;

public class Funcionario extends Endereço implements Pessoa {
    private String nome;
    private String documento;

    public Funcionario(String rua, String numero, String cidade, String cep, String bairro, String nome, String documento) {
        super(rua, numero, cidade, cep, bairro);
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                " nome='" + nome + '\'' +
                ", documento=' " + documento + '\'' +
                '}';
    }
}
