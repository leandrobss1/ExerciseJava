import java.util.Scanner;

public class CalcAltura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da base:");
        int base = leitor.nextInt();
        System.out.println("Digte o valor da altura");
        int altura = leitor.nextInt();

        int CalcArea = base * altura;

        System.out.printf("O valor da base do retângulo é de %d e sua altura %d, portanto sua área é de: %d", base,
                altura, CalcArea);

    }
}
