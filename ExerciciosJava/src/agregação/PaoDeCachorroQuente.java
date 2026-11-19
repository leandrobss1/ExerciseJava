package agregação;

public class PaoDeCachorroQuente {

    private Trigo fermento;

    public PaoDeCachorroQuente(String fermento) {
        this.fermento = new Trigo (fermento);
    }

    public Trigo getFermento() {
        return fermento;
    }

    public void setFermento(Trigo fermento) {
        this.fermento = fermento;
    }

    public void mostrarFermento(){
        System.out.println("Pão com fermento " + fermento.getFermento());
    }
}
