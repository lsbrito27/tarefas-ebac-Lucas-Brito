import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem vindo, iremos verificar se o aluno foi aprovado!");

        double nota1, nota2, nota3, nota4, mediaFinal;

        System.out.println("Digite a primeira nota:");
        nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = leitura.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = leitura.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = leitura.nextDouble();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media final foi: " + mediaFinal);

        if(mediaFinal >= 7){
            System.out.println("Aluno aprovado!");
        }else if(mediaFinal >= 5){
            System.out.println("Aluno em recuperação!");
        }else{
            System.out.println("Aluno reprovado!");
        }


    }
}
