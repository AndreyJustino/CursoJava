import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("Cloe");
        nameList.add(0, "Andrey");
        nameList.add("Adriana");
        nameList.add("Maria");
        nameList.add(1,"Java");
        nameList.add("C#");

        System.out.println("-----------------------");

        for(String value : nameList){
            System.out.println(value); // mostrando todos os elementos
        }

        System.out.println("-----------------------");

        System.out.println(nameList.size()); // tamanho da lista

        System.out.println("-----------------------");

        nameList.remove("C#");

        List<String> listNameA = nameList.stream().filter(value -> value.charAt(0) == 'A').toList();
        nameList.removeIf(value -> value.charAt(0) == 'A'); // removendo todos que começam com A

        System.out.println(nameList); // mostrar lista sem os que tem A
        System.out.println(listNameA); // mostra lista com os A

        System.out.println("-----------------------");

        System.out.println(nameList.size()); // novo tamanho da lista

        System.out.println(nameList.indexOf("Cloe")); // mostra o index da cloe

        System.out.println("-----------------------");
    }
}