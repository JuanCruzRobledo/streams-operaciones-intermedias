import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1- Ejemplo filter

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //2- Ejemplo map

        //Nombres en mayusculas
        List<String> nombres = List.of("ana", "juan", "elena");
        nombres.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        //Tomar las longitudes
        nombres.stream()
                .map(String::length)
                .forEach(System.out::println);

        //3- Ejemplo Distinct

        List<String> frutas = List.of("manzana", "naranja", "manzana", "pera", "naranja");
        frutas.stream()
                .distinct()
                .forEach(System.out::println);

        //4 - Ejemplo sorted

        //Numeros
        List<Integer> numerosSorted = List.of(5, 2, 8, 1, 3);

        numerosSorted.stream()
                .sorted()
                .forEach(System.out::println);
        //Ordenar por longitud de palabra

        List<String> palabras = List.of("Java", "es", "funcional");

        palabras.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        //5- Ejemplo Integrador

        List<String> frases = List.of(
                "Java es un lenguaje versátil",
                "La programación funcional en Java es poderosa",
                "Java tiene streams para procesamiento de datos"
        );

        frases.stream()
                .flatMap(frase -> Arrays.stream(frase.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
