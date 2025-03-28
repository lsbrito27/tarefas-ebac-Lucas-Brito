import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Lucas.Brito
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {

        leituraNomes();
        LeituraNomeSexo();

    }

   
     /**
     * Metodo que coleta uma String, faz o Split usando , como delimitador e alimenta uma lista e exibe ela
     * 
     */
    public static void leituraNomes() {
        System.out.println("****Iniciando Leitura somente de nomes****");
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite nomes separados somente por virgula:");
        String nome = leitura.nextLine();
        String[] nomes = nome.split(",");

        List<String> listaNomes = new ArrayList<String>();
        for (int i = 0; i < nomes.length; i++) {
            listaNomes.add(nomes[i]);
        }

        System.out.println("Nomes dividos na Lista:");
        System.out.println(listaNomes);

        Collections.sort(listaNomes);

        System.out.println("Nomes em ordem alfabetica:");
        System.out.println(listaNomes);
    }



    /**
     * Metodo que coleta uma String, faz o Split usando , como delimitador, divide ela em duas listas baseadas no sexo indicado com M ou F e mapea em outra lista utilizando 
     * o sexo como chave da lista
     */
    public static void LeituraNomeSexo() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("****Iniciando Leitura  de nomes e sexo****");
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite nomes separados somente por M(Masculino) e F(Feminino):");
        String nome = leitura.nextLine();
        String[] nomes = nome.split(",");

        List<String> listaFeminino = new ArrayList<>();
        List<String> listaMasculino = new ArrayList<>();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("F")) {
                listaFeminino.add(nomes[i + 1]);
            } else if (nomes[i].equals("M")) {
                listaMasculino.add(nomes[i + 1]);
            }
        }

        Map<String, List<String>> mapaOrdernado = new HashMap<String, List<String>>();
        mapaOrdernado.put("Masculino", listaMasculino);
        mapaOrdernado.put("Feminino", listaFeminino);

        System.out.println("Pessoas do Sexo feminino: " + mapaOrdernado.get("Feminino"));
        System.out.println("Pessoas do Sexo feminino: " + mapaOrdernado.get("Masculino"));

    }
}
