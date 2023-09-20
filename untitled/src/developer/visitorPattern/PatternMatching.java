package developer.visitorPattern;

public class PatternMatching {

    public int run(CreditCard card) {
        return switch (card) {
            case Visa v -> 1;
            case MasterCard m -> 2;
            default -> throw new UnsupportedOperationException();
        };
    }
}

class otherPatternMatching {
    public String run(CreditCard card) {
        return switch (card) {
            case Visa v -> "abc";
            case MasterCard m -> "cdb";
            default -> throw new UnsupportedOperationException();
        };
    }
}
