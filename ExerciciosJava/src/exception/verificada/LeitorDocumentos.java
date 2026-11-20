package exception.verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String args[]) {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\leand" +
                    ".DESKTOP-1TPKIKG\\Desktop\\Javanauta\\Texto.txt"));

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("O erro foi :" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}