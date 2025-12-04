import java.util.Scanner;

public class CalculandoCustos {

    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        for(; i < 2; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.next();

            System.out.println("Digite o preco de custo: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preco de venda: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto = precoCusto;
            totalVenda = totalVenda = precoVenda;


            if(precoCusto == precoVenda){
                System.out.println("Houve um empate entre o custo e venda.");
            } else {
                if(precoCusto > precoVenda){
                    System.out.println("Houve um prejuízo.");
                } else {
                    System.out.println("Houve um Lucro.");
                }
            }

            System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);

        }

        System.out.println("A media do preço de custo é: " + (totalCusto / 1));
        System.out.println("A media do preço de venda é: " + (totalVenda / 1));

    }
}

