package digital.innovation.one.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Paulo");
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2,"Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);
        nomes.set(2, "Wesley");
        System.out.println(nomes);
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("Wesley");
        System.out.println(nomes);
        String nome = nomes.get(1);
        System.out.println(nome);
        int posicao = nomes.indexOf("João");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temPaulo = nomes.contains("Paulo");
        System.out.println(temPaulo);
        boolean temJose = nomes.contains("Jose");
        System.out.println(temJose);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        for (String nomeDoItem: nomes ) {
            System.out.println("For --->"+ nomeDoItem);
        }
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("While --->" + iterator.next());
        }

        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);


    }
}
