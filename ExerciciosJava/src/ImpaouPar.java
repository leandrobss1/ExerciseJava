import java.util.Scanner;

public class ImpaouPar {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número maior que o anterior:");
        int num2 = scanner.nextInt();

        System.out.println("Escolha: par ou impar? (par) ou (impar)");
        String escolha = scanner.next();

        if(escolha.equalsIgnoreCase("par")){
            System.out.println("Você escolheu par.");
        } else if (escolha.equalsIgnoreCase("impar")){
            System.out.println("Você escolheu impar.");
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}
