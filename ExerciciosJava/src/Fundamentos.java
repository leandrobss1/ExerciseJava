import java.util.Scanner;

public class Fundamentos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = leitor.nextLine();

        System.out.println("Digite sua idade:");
        int age = leitor.nextInt();

        System.out.printf("Olá %s você tem %d anos", name, age);
    }
}