package agregação;

public class Principal {
    public static void main(String args[]){

        PaoDeCachorroQuente dog = new PaoDeCachorroQuente("royal");
        dog.mostrarFermento();

        dog.getFermento().setFermento("pamorals");

        dog.mostrarFermento();
    }
}
