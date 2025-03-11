public class App {
    public static void main(String[] args) throws Exception {

        //Pega as 4 notas do aluno.
        double nota1 = 5.5;
        double nota2 = 7.0;
        double nota3 = 3.5;
        double nota4 = 8.0;

        //Calcula a media das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        //Imprime a media 
        System.out.println("A media da nota foi: " + media);

    }
}
