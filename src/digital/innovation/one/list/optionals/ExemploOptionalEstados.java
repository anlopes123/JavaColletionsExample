package digital.innovation.one.list.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor optional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        System.out.println("Valor optional que não está presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = não está presente"));

        System.out.println("Valor optional que não está presente");
        Optional<String> optionalEmpty = Optional.empty();
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        System.out.println("Valor optional que não está presente");
        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("errp = não está presente"));
    }
}
