public class PrimeiraClasse {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.cadastrarEndeco("Rua Veneza 462");
        System.out.print(cliente.getEndereco());
    }
}
