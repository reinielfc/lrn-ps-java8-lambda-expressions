import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        /*
        - lambda expressions are fast!
        - use specialized lambdas when working w/ primitive types
        - they're specialized functions for each primitive type, which, if used, prevent the boxing and unboxing
          that affect the performance of applications
        */

        IntSupplier supplier = () -> 10;
        int i = supplier.getAsInt();
        System.out.println("i = " + i);

        DoubleToIntFunction function = (double value) -> (int) Math.floor(value);
        int pi = function.applyAsInt(Math.PI);
        System.out.println("pi = " + pi);
    }
}
