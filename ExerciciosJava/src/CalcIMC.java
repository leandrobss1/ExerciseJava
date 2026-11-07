import java.util.Scanner;

public class CalcIMC {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        double calcImc = peso / (altura * altura);

        if(calcImc <= 18.5){
            System.out.println("Abaixo do peso.");
        } else if (calcImc >= 18.6 && calcImc <= 24.9){
            System.out.println("Peso ideal.");
        } else if (calcImc >= 25.0 && calcImc <= 29.9){
            System.out.println("Levemente acima do peso.");
        } else if (calcImc >= 30 && calcImc <= 34.9){
            System.out.println("Obesidade Grau I.");
        } else if (calcImc >= 35.0 && calcImc <= 39.9){
            System.out.println("Obesidade grau II (Severe).");
        } else {
            System.out.println("Obesidade grau III (Mórbida).");
        }
    }

}
