package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_teste {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        //adicionando itens a uam lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        //quantidade de elementos em uma lista
        System.out.println(list.size());

        //varendo todos os itens de uma lista
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("-----------------------------------");
        
        //removendo item de uma lista
        list.remove(0);
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String x : list){
            System.out.println(x);
        }

        //Indentificando quem esta em uma Lista
        System.out.println("-----------------------------------");
        System.out.println("indentificação de Bob: "+ list.indexOf("Bob"));
        System.out.println("indentificação de Marco: "+ list.indexOf("Marco"));
        System.out.println("-----------------------------------");

        //seleção de permanencia em uma lista
        //usando o collect, para coletar esses dados em uma nova lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
        
        //indentificar o primeiro nome uma determinada letra
        //uasndo o "FindFirst" se caso não achar usa o "orElse"
        System.out.println("-----------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
