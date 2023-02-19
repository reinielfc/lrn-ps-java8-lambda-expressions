import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MoreLambdas {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five"
        ));

        //Predicate<String> filter = (String s) -> s.startsWith("t");
        //Predicate<String> filter = (s) -> s.startsWith("t");
        Predicate<String> filter = s -> s.startsWith("t");
        strings.removeIf(filter);

        //Consumer<String> action = s -> System.out.println(s);
        //strings.forEach(action);

        strings.forEach(s -> System.out.println(s));

    }
}
