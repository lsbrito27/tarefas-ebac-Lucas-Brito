import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        String[] nomes = nome.split((","));

        List<String> ListaMasculino = new ArrayList<>();
        List<String> ListaFeminino = new ArrayList<>();

        for(int i = 0; i < nomes.length;i++){
            if(nomes[i].equals("F")){
                ListaFeminino.add(nomes[i+1]);
            }else if(nomes[i].equals("M")){
                ListaMasculino.add(nomes[i+1]);
            }
        }

      Map<String, List<String>> mapaNomes = new HashMap<String, List<String>>();

      mapaNomes.put("Feminino", ListaFeminino);
      mapaNomes.put("Masculino",ListaMasculino);

      System.out.println(mapaNomes.get("Feminino"));
      System.out.println(mapaNomes.get("Masculino"));
    }
}
