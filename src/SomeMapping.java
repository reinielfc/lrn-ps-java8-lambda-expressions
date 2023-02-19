import model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
    public static void main(String[] args) {
        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = Arrays.asList(sarah, james, mary, john);

        List<String> names = new ArrayList<>();
        Function<User, String> toName = (User u) -> u.getName();

        for (User user: users) {
            String name = toName.apply(user);
            names.add(name);
        }

        //Consumer<User> action = u -> System.out.println(u);
        users.forEach(u -> System.out.println(u));
        names.forEach(s -> System.out.println(s));

        /*
         ## Java Functional Interfaces Toolbox ##

         ### Runnable ###
         interface: Runnable
         method:    void run()
         example:   () -> System.out.println("I am alive!");

         ### Supplier ###
         interface: Supplier<T>
         method:    T get()
         example:   () -> "Hello";

         ### Consumer ###
         interface: Consumer<T>
         method:    void accept(T t)
         example:   string -> System.out.println(string);

         ### Predicate ###
         interface: Predicate<T>
         method:    boolean test(T t)
         example:   string -> string.isEmpty();

         ### Function ###
         interface: Function<T, R>
         method:    R apply(T t)
         example:   user -> user.getName();
         */

    }
}
