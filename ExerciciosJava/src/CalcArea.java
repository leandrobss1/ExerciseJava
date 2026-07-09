import java.util.Scanner;

public class CalcArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado:");
        int lado = scanner.nextInt();

        int calcArea = lado * lado;
        System.out.printf("A área do quadrado é: %d", calcArea);
    }

}
