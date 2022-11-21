package be.intecbrussel;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Predicate<String> removeNullValues = element -> element != null; // && or & !element.isEmpty();
        Predicate<String> removeEmptyStrings = element -> !element.isEmpty();

        String[] strArr = {"Hello", "World", "", null, "Generic"};
        //System.out.println(Arrays.toString(strArr));
        Stream.of(strArr)
                //.peek(word -> System.out.println(word))
                .filter(removeNullValues)
                .filter(removeEmptyStrings) //null pointer exception
                .forEach(word -> System.out.println("FILTERED: " + word));
    }
}
