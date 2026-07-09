import java.util.Scanner;

public class CalcIdade {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);

        System.out.println("COMPARANDO IDADE");
        System.out.println("----------------");

        System.out.println("Digite a sua idade:");
        int idade1 = leitor.nextInt();

        System.out.println("Digite outra idade:");
        int idade2 = leitor.nextInt();

        int comparacao = idade1 - idade2;

        System.out.printf("A comparação da primeira idade para a segunda é de: %s anos.\n", comparacao);

        System.out.println("----------------");



    }
}
