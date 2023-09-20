package developer;

public abstract class AbstractTemplate {

    public void doSomething() {
        // código a ser executado antes
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

        //código que varia
        System.out.println(getValue());

        // código a ser executado depois
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
    }

    public abstract String getValue();
}

class OneImplementation extends AbstractTemplate {

    @Override
    public String getValue() {
        return "123";
    }
}

class TwoImplementation extends AbstractTemplate {

    @Override
    public String getValue() {
        return "321";
    }
}
