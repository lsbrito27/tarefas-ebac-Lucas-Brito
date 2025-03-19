import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int idade;

        //Instanciando o objeto scanner que vai fazer a leitura da variavel idade pelo console.
        Scanner scanner = new Scanner(System.in);


        for(int i = 0;i <= 10; i++){
            
            if(i%2 == 0){
                System.out.println(i);
                System.out.println("Numero Par!");
                continue;
            }
           
        }
    }

}