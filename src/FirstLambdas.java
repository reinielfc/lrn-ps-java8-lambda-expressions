import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {
    public static void main(String[] args) {
        /*
         *    lambda -- an instance of a functional interface.
         *  functional interface -- interface with only 1 (abstract) method
         */

        // 2. Implementing and Running the Supplier Interface
        Supplier<String> supplier = () -> "Hello";

        String string = supplier.get(); // invoke lambda
        System.out.println("string = " + string);

        // 2. Implementing and Running the Consumer Interface
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("Hello");

        // multiline consumer
        consumer = (String s) -> {
            System.out.println("I am inside the consumer");
            System.out.println(s);
        };
        consumer.accept("Hello");

        // multiline supplier
        supplier = () -> {
            System.out.println("I am inside the supplier");
            return "Hello";
        };
        string = supplier.get();
        System.out.println("string = " + string);
    }
}
