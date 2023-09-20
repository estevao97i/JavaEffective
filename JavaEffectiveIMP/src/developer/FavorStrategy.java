package developer;

import java.util.function.Supplier;

public class FavorStrategy {

    // Supplier porque nao recebe nenhum parametro e retorna um valor do tipo String -> Lambda Functions
    private final Supplier<String> supplier;

    private FavorStrategy(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    public static FavorStrategy of(Supplier<String> supplier) {
        return new FavorStrategy(supplier);
    }

    public void doSomething() {
        // código a ser executado antes
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

        //código que varia
        System.out.println(supplier.get());

        // código a ser executado depois
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
    }

    public static void main(String[] args) {
       FavorStrategy.of(() -> "321").doSomething();
       FavorStrategy.of(() -> "123").doSomething();
    }
}
