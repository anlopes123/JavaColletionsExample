package digital.innovation.one.list;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("MG", "Belo Horizonte");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("SP", "São Paulo");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstKey());

        System.out.println(treeCapitais.lastKey());

        System.out.println(treeCapitais.lowerKey("SC"));
        System.out.println(treeCapitais.higherKey("SC"));
        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.pollFirstEntry().getKey() + " - " + treeCapitais.pollFirstEntry().getValue());
        System.out.println(treeCapitais.pollLastEntry().getKey() + " - " + treeCapitais.pollLastEntry().getValue());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        System.out.println("While Iterator ");
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }
        System.out.println("For KeySet");
        for (String capital: treeCapitais.keySet() ) {
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }
        System.out.println("For Entry");
        for (Map.Entry<String, String> capital: treeCapitais.entrySet() ) {
            System.out.println(capital.getKey() + " - " + capital.getValue() );
        }
        System.out.println(treeCapitais.size());
        System.out.println(treeCapitais.isEmpty());
        treeCapitais.clear();
        System.out.println(treeCapitais.isEmpty());






    }
}
