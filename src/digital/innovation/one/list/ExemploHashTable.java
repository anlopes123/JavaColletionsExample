package digital.innovation.one.list;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);
        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        for (Map.Entry<String, Integer> entry: estudantes.entrySet() ) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : estudantes.keySet() ) {
            System.out.println(key  + " -- " + estudantes.get(key));
        }

        System.out.println(estudantes.size());
        System.out.println(estudantes.isEmpty());
        estudantes.remove("Mariana");
        System.out.println(estudantes);

        estudantes.clear();
        System.out.println(estudantes.isEmpty());
    }
}
