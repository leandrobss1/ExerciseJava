package composição;

public class Principal {
    public static void main(String arg[]){

        Pessoa ana = new Pessoa("Ana", "Apple");
        ana.mostrarCelular();
        ana.getCelular().setMarca("Samsung");
        ana.mostrarCelular();

        System.out.println(ana.getNome());
        ana.setNome("Maria");
        System.out.println(ana.getNome());
        ana.mostrarCelular();

    }
}
