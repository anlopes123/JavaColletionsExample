package digital.innovation.one.list;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sao Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first());

        System.out.println(treeCapitais.last());

        System.out.println(treeCapitais.lower("Florianopolis"));

        System.out.println(treeCapitais.higher("Florianopolis"));

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.pollFirst());

        System.out.println(treeCapitais.pollLast());

        Iterator<String> iterator = treeCapitais.iterator();
        while(iterator.hasNext()) {
            System.out.println("While --> " + iterator.next());
        }

        for (String cidade: treeCapitais) {
            System.out.println("For --> " + cidade);
        }

        System.out.println(treeCapitais.isEmpty());

        treeCapitais.clear();
        System.out.println(treeCapitais.isEmpty());


    }
}
