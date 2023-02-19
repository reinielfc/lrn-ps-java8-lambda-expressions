import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class CreatingComparators {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        ));

        //Comparator<String> cmp = (String s1, String s2) -> s1.compareTo(s2);
        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);
        strings.sort(cmp);
        System.out.println(strings);

        //Comparator<String> cmp2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        //Function<String, Integer> toLength = s -> s.length();
        //Comparator<String> cmp2 = Comparator.comparing(toLength);

        ToIntFunction<String> toLength = s -> s.length(); // avoid boxing
        Comparator<String> cmp2 = Comparator.comparingInt(toLength);

        strings.sort(cmp2);
        System.out.println(strings);

    }
}
