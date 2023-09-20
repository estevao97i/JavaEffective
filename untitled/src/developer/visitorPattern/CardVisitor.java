package developer.visitorPattern;

public interface CardVisitor<T> {

    public T visit(Visa visa);

    public T visit(MasterCard masterCard);

}
