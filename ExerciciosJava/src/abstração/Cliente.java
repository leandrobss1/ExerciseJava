package abstração;

public class Cliente extends Endereço {
    private String nome;
    private String documento;

    public Cliente(String rua, String cidade, String cep, String bairro, String nome, String documento) {
        super(rua, cidade, cep, bairro);
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

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
