package associação;


import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String args[]){

        Carro fusca = new Carro(200);
        fusca.mostrarCilindradas();

        Funcionarios leandro = new Funcionarios("Leandro");
        Funcionarios agnes = new Funcionarios("Agnes");
        Funcionarios caua = new Funcionarios("Cauã");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add(agnes);
        listaDeFuncionarios.add(caua);
        listaDeFuncionarios.add(leandro);


        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();
    }
}
