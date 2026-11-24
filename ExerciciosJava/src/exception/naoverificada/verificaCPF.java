package exception.naoverificada;

import java.util.Scanner;

public class verificaCPF {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um CPF para cadastro:");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }

    public static String verificaCPF(String cpf){

        try {

            if (cpf.equals("04791638449")) {
                throw new RuntimeException("CPF, já cadastrado." + cpf);
            } else {
                return "O CPF foi verificado com sucesso.";
            }

        } catch (RuntimeException e) {
            throw new RuntimeException("CPF, já cadastrado." + cpf);
        }

    }


}
