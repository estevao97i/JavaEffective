package developer;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Locale;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReferences {

    public static void main(String[] args) {
        st(s -> Integer.parseInt(s));
        st(Integer::parseInt); // refactor

        bound(instant -> Instant.now().isAfter(instant));
        bound(Instant.now()::isAfter); // refactor

        unbound(s -> s.toLowerCase());
        unbound(String::toLowerCase); // refactor

        constructor(() -> new TreeMap<>());
        constructor(TreeMap::new); // refactor

        array(i -> new int[i]);
        array(int[]::new); // refactor
    }

    public static void st(Function<String, Integer> args) {

    }

    public static void bound(Predicate<Instant> args) {

    }

    public static void unbound(UnaryOperator<String> args) {

    }

    public static void constructor(Supplier<TreeMap<String, String>> args) {

    }

    public static void array(Function<Integer, int[]> args) {

    }
}
