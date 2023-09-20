package developer.visitorPattern;

public abstract class CreditCard {

    public abstract <T> T doSomething(CardVisitor<T> cardVisitor);
}

interface CardVisitor<T> {

    public T visit(Visa visa);

    public T visit(MasterCard masterCard);

}

class Visa extends CreditCard {

    @Override
    public <T> T doSomething(CardVisitor<T> cardVisitor) {
        return cardVisitor.visit(this);
    }
}

class MasterCard extends CreditCard {

    @Override
    public <T> T doSomething(CardVisitor<T> cardVisitor) {
        return cardVisitor.visit(this);
    }
}
