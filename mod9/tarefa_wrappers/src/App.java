import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int idade;

        //Instanciando o objeto scanner que vai fazer a leitura da variavel idade pelo console.
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a sua idade: ");
        
        //Lendo a idade do usuario
        idade = scanner.nextInt();

        //Conversao de tipo primitivo para tipo complexo
        Integer idadeWrapper  = idade;
        System.out.print("Sua idade é: " + idadeWrapper);

    }
}
