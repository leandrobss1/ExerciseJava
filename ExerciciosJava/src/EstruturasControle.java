import java.util.Scanner;

public class EstruturasControle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println("====TABUADA====");

        for(int i = 0; i <= 10; i++){

            System.out.printf("%d x %d : %d \n",numero, i, i * numero);
        }

        scanner.close();
    }
}
