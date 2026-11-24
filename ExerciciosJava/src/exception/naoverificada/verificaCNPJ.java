package exception.naoverificada;

import java.util.Scanner;

public class verificaCNPJ {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu CPNJ para cadastro:");
        String verificandoCNPJ = verificaCNPJ(leitor.nextLine());
        System.out.println(verificandoCNPJ);

    }

    public static String verificaCNPJ(String cnpj) {

        try {

            if (cnpj.equals("04732812000198")) {
                throw new RuntimeException("O documento informado encontra-se existente.");
            } else {
                return "CNPJ cadastrado com sucesso.";
            }

        } catch(RuntimeException e) {
            throw new RuntimeException("O documento informado encontra-se existente." + cnpj);
        }
    }
}
