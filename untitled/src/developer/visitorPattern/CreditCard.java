package developer.visitorPattern;

public abstract class CreditCard {

    public abstract void doSomething();
    public abstract void doSomething1();
    public abstract void doSomething2();
    public abstract void doSomething3();
}

class Visa extends CreditCard {

    @Override
    public void doSomething() {

    }

    @Override
    public void doSomething1() {

    }

    @Override
    public void doSomething2() {

    }

    @Override
    public void doSomething3() {

    }
}

class MasterCard extends CreditCard {

    @Override
    public void doSomething() {

    }

    @Override
    public void doSomething1() {

    }

    @Override
    public void doSomething2() {

    }

    @Override
    public void doSomething3() {

    }
}
