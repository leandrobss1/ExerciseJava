package animais;

public class Principal {
    public static void main (String[] args){
        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer();

        Galinha josefina = new Galinha();
        josefina.ciscar();
        josefina.comer();
        josefina.beberAgua();

    }
}
