package abstração;

public abstract class Endereço {
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
    private String bairro;

    public Endereço() {
    }

    public Endereço(String rua, String numero, String cidade, String cep, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
    }

    public Endereço(String rua, String cidade, String cep, String bairro) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void mostrarEndereço(){
        System.out.println("O Endereço é: " + getRua() + ", " + getNumero() + ", " + getCidade());
    }

}
