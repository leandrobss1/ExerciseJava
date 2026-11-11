package animais;

public class Principal {
    public static void main (String[] args){
        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("carne");

        Galinha josefina = new Galinha();
        josefina.ciscar();
        josefina.comer("milho");
        josefina.beberAgua(2);

    }
}
