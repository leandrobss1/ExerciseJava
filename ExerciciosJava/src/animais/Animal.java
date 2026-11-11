package animais;

public class Animal {
    void comer(String alimento){
        System.out.println("O animal comeu " + alimento +".");
    }

    void correu(){
        System.out.println("O animal correu.");
    }

    void beberAgua(int quantidade){
        System.out.println("O animal bebeu água " + quantidade +" vezes.");
    }
}
