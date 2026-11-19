package escola;

public class Principal {
    public static void main(String args[]){
        Aluno bruno = new Aluno("Bruno", "Azul");
        bruno.mostrarMochila();

        bruno.getMochila().setCor("Vermelha");
        bruno.mostrarMochila();
        bruno.setNome("Carlos");
        bruno.mostrarMochila();

    }
}

