package abstração;

public class Principal {
    public static void main(String arg[]){
        Funcionario leo = new Funcionario("Total Ville", "301", "Brasília", "72583500", "Santa Maria", "Leo",
                "04791637743");

        Cliente cris = new Cliente("Total Ville", "Brasília", "7845239", "Santa Maria", "Cris", "05758348232");

        System.out.println(leo);
        System.out.println(cris);
    }

}
